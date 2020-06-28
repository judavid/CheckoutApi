package com.logisticsevice.logistic.business;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.logisticsevice.logistic.model.Order;
import com.logisticsevice.logistic.model.SentOrder;

@Service
public class LogisticService {
	
	public SentOrder createOrder(Order order) {
		Date date = new Date();
		String guide = UUID.randomUUID().toString();
		String shippingCompany = "DHL";
		String shippingAddress = order.getDirection();
		return new SentOrder(guide, order.getClientId(), date, shippingAddress, shippingCompany, order.getProducts());
	}

}
