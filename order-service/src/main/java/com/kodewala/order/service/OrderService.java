package com.kodewala.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.order.entity.OrderEntity;
import com.kodewala.order.kafka.service.KafkaService;
import com.kodewala.order.payment.client.PaymentClient;
import com.kodewala.order.repository.OrderRepository;
import com.kodewala.order.request.OrderRequest;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	KafkaService kafkaService;

	@Autowired
	PaymentClient paymentClient;

	@CircuitBreaker(name = "paymentService", fallbackMethod = "paymentFallback")
	public void placeOrder(OrderRequest orderRequest) {

		OrderEntity entity = new OrderEntity();

		entity.setItemName(orderRequest.getItemName());
		entity.setStatus(orderRequest.getStatus());

		// Calling payment service 
		String response = paymentClient.confirmPayment("54364567544", 12000);

		System.out.println("Response from payment service : " + response);

		orderRepository.save(entity);
		
		/*
		 * for (int i = 0; i <= 1000; i++) { // Send data to kafka topic..... String
		 * value = orderRequest.getItemName()+i + " " + orderRequest.getStatus()+i;
		 * 
		 * kafkaService.sendMessage("order-confirmed", "key123", value); }
		 */
		 
	}

	public void paymentFallback(OrderRequest orderRequest, Exception ex) {

		System.out.println("Payment service unavailable : " + ex.getMessage());

		// Option 1 : Save order with PAYMENT_PENDING OR do something else

		OrderEntity entity = new OrderEntity();

		entity.setItemName(orderRequest.getItemName());
		entity.setStatus("PAYMENT_PENDING");

		orderRepository.save(entity);
		
		
	}
}