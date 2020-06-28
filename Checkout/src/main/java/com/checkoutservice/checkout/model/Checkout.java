package com.checkoutservice.checkout.model;

import java.io.Serializable;
import java.util.Date;

public class Checkout implements Serializable {
	
	private String guide;
	private int clientId;
	private Date date;
	private String shippingAddress;
	private String shippingCompany;
	private Bill bill;
	
	public Checkout() {
	}
	
	public Checkout(String guide, int clientId, Date date, String shippingAddress, String shippingCompany,
			Bill bill) {
		this.guide = guide;
		this.clientId = clientId;
		this.date = date;
		this.shippingAddress = shippingAddress;
		this.shippingCompany = shippingCompany;
		this.bill = bill;
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

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

}
