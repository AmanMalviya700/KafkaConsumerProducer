package com.aman.KafkaProducerConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.KafkaProducerConsumer.service.Producer;

@RestController
public class KafkaController {

	@Autowired
	Producer producer;
	
	@PostMapping("/post/{msg}")
	public void sendMessage(@PathVariable String msg) {
		producer.publishToKafkaTopic(msg);
	}
	
}
