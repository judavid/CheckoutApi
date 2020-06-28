package com.logisticsevice.logistic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private int clientId;
	private Date date;
	private String direction;
	private List<Product> products = new ArrayList<>();
	
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	} 
	
}
