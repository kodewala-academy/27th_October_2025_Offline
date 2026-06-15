package com.kodewala.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.order.entity.OrderEntity;
import com.kodewala.order.kafka.service.KafkaService;
import com.kodewala.order.payment.client.PaymentClient;
import com.kodewala.order.repository.OrderRepository;
import com.kodewala.order.request.OrderRequest;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	KafkaService kafkaService;

	@Autowired
	PaymentClient paymentClient;

	public void placeOrder(OrderRequest orderRequest) {
		OrderEntity entity = new OrderEntity();

		entity.setItemName(orderRequest.getItemName());
		entity.setStatus(orderRequest.getStatus());

		// Calling and confirming the payment before placing the order.
		String response = paymentClient.confirmPayment("54364567544", 12000);
		
		System.out.println(" Response received from payment service :::::::: " + response);
		
		orderRepository.save(entity); // Interacting with database

		/*
		 * for (int i = 0; i <= 1000; i++) { // Send data to kafka topic..... String
		 * value = orderRequest.getItemName()+i + " " + orderRequest.getStatus()+i;
		 * 
		 * kafkaService.sendMessage("order-confirmed", "key123", value); }
		 */
	}

}
