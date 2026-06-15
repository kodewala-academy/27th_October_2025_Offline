package com.kodewala.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

	@GetMapping("/pay/{card}/{amount}")
	public String confirmPayment(@PathVariable("card") String card, @PathVariable("amount") int amount) {
		System.out.println(" card ::::::" + card);
		System.out.println(" amount ::::" + amount);
		return "CONFIRMED";
	}

}
