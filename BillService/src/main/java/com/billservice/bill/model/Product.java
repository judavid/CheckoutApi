package com.billservice.bill.model;

import java.io.Serializable;

public class Product implements Serializable {

	private int id;
	private int quantity;
	private long cost;
	
	
	public Product(int id, int quantity, long cost) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	
	
	
}
