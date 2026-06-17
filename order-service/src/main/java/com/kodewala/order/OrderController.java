package com.kodewala.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.order.request.OrderRequest;
import com.kodewala.order.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderService orderService;

	private static final Logger log = LoggerFactory.getLogger(OrderController.class);

	@PostMapping("/place")
	public String placeOrder(@RequestBody OrderRequest orderRequest) {
		orderService.placeOrder(orderRequest);

		log.info("Order Request Received");

		log.info("TraceId={}, SpanId={}");

		return " order has been successfully placed!!";
	}

}
