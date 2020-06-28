package com.logisticsevice.logistic.view.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.logisticsevice.logistic.business.LogisticService;
import com.logisticsevice.logistic.model.Order;
import com.logisticsevice.logistic.model.SentOrder;


@RestController
@RequestMapping(path = "/logistic")
public class LogisticResource {
	
	private LogisticService logisticService;
	
	public LogisticResource(LogisticService logisticService) {
		this.logisticService = logisticService;
	}

	@PostMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody SentOrder sentOrder(@RequestBody Order order) {
		return logisticService.createOrder(order);
	}
	
}
