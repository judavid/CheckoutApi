package com.billservice.bill.business.service;

import org.springframework.stereotype.Service;

import com.billservice.bill.model.Bill;
import com.billservice.bill.model.Order;
import com.billservice.bill.model.Product;

@Service
public class BillService {
	
	public Bill createBill(Order order) {
		Long sum = 0L;
		for(Product p : order.getProducts()) {
			sum += p.getQuantity() * p.getCost();
		}
		return new Bill(sum,  order);
	}
	
	//TODO
	public Bill updateBill(Integer idBill, Order order) {
		return new Bill(null,  order);
	}
	
	//TODO
	public Bill deleteBill(Integer idBill) {
		return new Bill(null, null);
	}

}
