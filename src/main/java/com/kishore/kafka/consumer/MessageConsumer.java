package com.kishore.kafka.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

	private List<String> messages = new ArrayList<>();

	@KafkaListener(topics = "${message.topic.name}", groupId = "group1", containerFactory = "groupOneKafkaListenerContainerFactory")
	public void listenGroup1(String message) {
		messages.add("Received: " + message);
	}

	public List<String> getMessages() {
		return messages;
	}

}
