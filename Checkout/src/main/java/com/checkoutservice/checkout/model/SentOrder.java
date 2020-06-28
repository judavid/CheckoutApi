package com.checkoutservice.checkout.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SentOrder implements Serializable {
	
	private String guide;
	private int clientId;
	private Date date;
	private String shippingAddress;
	private String shippingCompany;
	private List<Product> products;
	
	public SentOrder() {
	}
	
	public SentOrder(String guide, int clientId, Date date, String shippingAddress, String shippingCompany,
			List<Product> products) {
		super();
		this.guide = guide;
		this.clientId = clientId;
		this.date = date;
		this.shippingAddress = shippingAddress;
		this.shippingCompany = shippingCompany;
		this.products = products;
	}
	
	public String getGuide() {
		return guide;
	}
	public void setGuide(String guide) {
		this.guide = guide;
	}
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

	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getShippingCompany() {
		return shippingCompany;
	}
	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
