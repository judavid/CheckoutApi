package com.checkoutservice.checkout.view.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.checkoutservice.checkout.business.services.CheckoutService;
import com.checkoutservice.checkout.model.Checkout;
import com.checkoutservice.checkout.model.Order;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;




@RestController
@RequestMapping(path = "/checkout")
@Api(value="Checkout", description ="Operations pertaining to checkout business")
public class CheckoutResources {
	
	private CheckoutService checkoutService;
	
	public CheckoutResources(CheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}

	@ApiOperation(value = "Create a Checkout  with a order of a clientId, the operation use the bill and logistic service", response = Checkout.class)
	@PostMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Checkout checkout(@RequestBody Order order) {
		return this.checkoutService.checkout(order);
	}
	
}
