package br.com.socysociety.kafkatutorial.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "users", groupId = "group_id")
	public void consumeUser(String message) throws IOException {
		System.out.println("consumed message user topic " + message);
	}
	
	@KafkaListener(topics = "teste", groupId = "group_id")
	public void consumeTeste(String message) throws IOException {
		System.out.println("consumed message topico teste " + message);
	}
}
