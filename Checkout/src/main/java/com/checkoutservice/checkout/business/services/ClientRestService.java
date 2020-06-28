package com.checkoutservice.checkout.business.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.checkoutservice.checkout.model.Bill;
import com.checkoutservice.checkout.model.Order;
import com.checkoutservice.checkout.model.SentOrder;

@Service
public class ClientRestService {
	
	//this data must be parameters
	private static final String PARAM_IP_PORT_BILL_SERVICE = "bill.host";
	private static final String RESOURCE_PATH_BILL = "/bill";
	private static final String PARAM_IP_PORT_LOGISTIC_SERVICE = "logistic.host";
	private static final String RESOURCE_PATH_LOGISTIC = "/logistic";

	
	@Autowired
	private RestTemplate clientRest;
	@Autowired
	private Environment env;
	
	public Bill callBillService(Order order) {
		HttpEntity<Order> request = getHeaders(order);
		ResponseEntity<Bill> response = clientRest.postForEntity(env.getProperty(PARAM_IP_PORT_BILL_SERVICE) + RESOURCE_PATH_BILL, request, Bill.class);
	    return response.getBody();
	}
	
	public SentOrder callLogisticService(Order order) {
		HttpEntity<Order> request = getHeaders(order);
	    return clientRest.exchange(env.getProperty(PARAM_IP_PORT_LOGISTIC_SERVICE) + RESOURCE_PATH_LOGISTIC, HttpMethod.POST, request, SentOrder.class).getBody();
	}

	private HttpEntity<Order> getHeaders(Order order) {
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<Order> request = new HttpEntity<>(order, headers);
		return request;
	}

}
