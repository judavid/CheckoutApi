package com.checkoutservice.checkout.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkoutservice.checkout.model.Bill;
import com.checkoutservice.checkout.model.Checkout;
import com.checkoutservice.checkout.model.Order;
import com.checkoutservice.checkout.model.SentOrder;

@Service
public class CheckoutService {
	
	@Autowired
	private ClientRestService clientRestService;
	
	public Checkout checkout(Order order) {
		Bill bill = clientRestService.callBillService(order);
		SentOrder sentOrder = clientRestService.callLogisticService(order);
		return new Checkout(sentOrder.getGuide(), sentOrder.getClientId(), sentOrder.getDate(),
				sentOrder.getShippingAddress(), sentOrder.getShippingCompany(), bill);
	}

}
