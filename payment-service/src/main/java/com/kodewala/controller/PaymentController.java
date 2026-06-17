package com.kodewala.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

	@GetMapping("/pay/{card}/{amount}")
	public String confirmPayment(@PathVariable("card") String card, @PathVariable("amount") int amount) {
		System.out.println(" card ::::::" + card);
		System.out.println(" amount ::::" + amount);

		log.info("Paymen Request Received");

		return "CONFIRMED";
	}

}
