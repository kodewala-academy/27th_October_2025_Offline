package com.kodewala.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.order.entity.OrderEntity;
import com.kodewala.order.kafka.service.KafkaService;
import com.kodewala.order.repository.OrderRepository;
import com.kodewala.order.request.OrderRequest;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	KafkaService kafkaService;

	public void placeOrder(OrderRequest orderRequest) {
		OrderEntity entity = new OrderEntity();

		entity.setItemName(orderRequest.getItemName());
		entity.setStatus(orderRequest.getStatus());

		orderRepository.save(entity); // Interacting with database

		// Send data to kafka topic.....
		String value = orderRequest.getItemName() + " " +orderRequest.getStatus();
		
		kafkaService.sendMessage("order-confirmed", null, value);

	}

}
