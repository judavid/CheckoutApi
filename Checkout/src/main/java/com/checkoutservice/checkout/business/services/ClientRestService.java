package com.checkoutservice.checkout.business.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	private static final String URL_BILL_SERVICE = "http://localhost:8081/bill";
	private static final String URL_LOGISTIC_SERVICE = "http://localhost:8082/logistic";
	
	@Autowired
	private RestTemplate clientRest;
	
	public Bill callBillService(Order order) {
		HttpEntity<Order> request = getHeaders(order);
		ResponseEntity<Bill> response = clientRest.postForEntity(URL_BILL_SERVICE, request, Bill.class);
	    return response.getBody();
	}
	
	public SentOrder callLogisticService(Order order) {
		HttpEntity<Order> request = getHeaders(order);
	    return clientRest.exchange(URL_LOGISTIC_SERVICE, HttpMethod.POST, request, SentOrder.class).getBody();
	}

	private HttpEntity<Order> getHeaders(Order order) {
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<Order> request = new HttpEntity<>(order, headers);
		return request;
	}

}
