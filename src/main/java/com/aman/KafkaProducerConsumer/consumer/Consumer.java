package com.aman.KafkaProducerConsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="mytopic",groupId="mygroup")
	public void consumeFromKafkaTopic(String msg) {
		System.out.println("consumed msg :"+msg);
	}
	
}