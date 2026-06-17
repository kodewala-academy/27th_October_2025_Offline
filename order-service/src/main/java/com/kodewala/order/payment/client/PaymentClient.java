package com.kodewala.order.payment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "payment-service", configuration = TracingFeignConfig.class)
@Component
public interface PaymentClient {
	@GetMapping("payment/pay/{card}/{amount}")
	public String confirmPayment(@PathVariable("card") String card, @PathVariable("amount") int amount);

}
