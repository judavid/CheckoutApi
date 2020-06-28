package com.billservice.bill.view.resources;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.billservice.bill.business.service.BillService;
import com.billservice.bill.model.Bill;
import com.billservice.bill.model.Order;


@RestController
@RequestMapping(path = "/bill")
public class BillResources {
	
	private BillService billService;
	
	public BillResources(BillService billService) {
		this.billService = billService;
	}

	@PostMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Bill getData(@RequestBody Order order) {
		return billService.bill(order);
	}
	
}
