package com.billservice.bill.view.resources;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.billservice.bill.business.service.BillService;
import com.billservice.bill.model.Bill;
import com.billservice.bill.model.Order;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(path = "/bill")
@Api(value="Bill", description ="Operations pertaining to Bill")
public class BillResources {
	
	private BillService billService;
	
	public BillResources(BillService billService) {
		this.billService = billService;
	}

	@ApiOperation(value = "Create a bill for clientId", response = Bill.class)
	@PostMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Bill createBill(@RequestBody Order order) {
		return billService.createBill(order);
	}
	
	
	@ApiOperation(value = "update a bill for idBill", response = Bill.class)
	@PutMapping(path = "/{idBill}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Bill updateBill(@PathVariable Integer idBill, @RequestBody Order order) {
		return billService.updateBill(idBill, order);
	}
	
	@ApiOperation(value = "delete a bill for idBill", response = Bill.class)
	@DeleteMapping(path = "/{idBill}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Bill deleteBill(@PathVariable Integer idBill) {
		return billService.deleteBill(idBill);
	}
	
	
}
