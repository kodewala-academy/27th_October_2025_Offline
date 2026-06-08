package com.kodewala.order.kafka.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String _topic, String _key, String _value) {

		ProducerRecord<String, String> record = new ProducerRecord<String, String>(_topic, _key, _value);

		CompletableFuture<SendResult<String, String>> response = kafkaTemplate.send(record);

		SendResult<String, String> result = null;
		try {
			result = response.get();
		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (ExecutionException e) {

			e.printStackTrace();
		}

		System.out.println("Topic: " + result.getRecordMetadata().topic());
		System.out.println("Partition: " + result.getRecordMetadata().partition());
		System.out.println("Offset: " + result.getRecordMetadata().offset());
	}

}
