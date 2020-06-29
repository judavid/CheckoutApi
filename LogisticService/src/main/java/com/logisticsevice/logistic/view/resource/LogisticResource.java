package com.logisticsevice.logistic.view.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.logisticsevice.logistic.business.LogisticService;
import com.logisticsevice.logistic.model.Order;
import com.logisticsevice.logistic.model.SentOrder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(path = "/logistic")
@Api(value="Logistic", description ="Operations pertaining to Logistic business")
public class LogisticResource {
	
	private LogisticService logisticService;
	
	public LogisticResource(LogisticService logisticService) {
		this.logisticService = logisticService;
	}

	@ApiOperation(value = "Create a SentOrder for clientId", response = SentOrder.class)
	@PostMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody SentOrder sentOrder(@RequestBody Order order) {
		return logisticService.createOrder(order);
	}
	
	@ApiOperation(value = "update a SentOrder for clientId", response = SentOrder.class)
	@PutMapping(path = "/{idSentOder}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody SentOrder updateSentOrder(@PathVariable Integer idSentOder, @RequestBody Order order) {
		return logisticService.updateOrder(idSentOder,order);
	}
	
	@ApiOperation(value = "delete a SentOrder for clientId", response = SentOrder.class)
	@DeleteMapping(path = "/{idSentOder}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody SentOrder deleteSentOrder(@PathVariable Integer idSentOder) {
		return logisticService.deleteOrder(idSentOder);
	}
	
}
