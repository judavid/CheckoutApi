package com.billservice.bill.model;

import java.io.Serializable;

public class Bill implements Serializable {

	private Long sum;
	private Order order;
	
	public Bill() {

	}

	public Bill(Long sum, Order order) {
		super();
		this.sum = sum;
		this.order = order;
	}
	public Long getSum() {
		return sum;
	}
	public void setSum(Long sum) {
		this.sum = sum;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
