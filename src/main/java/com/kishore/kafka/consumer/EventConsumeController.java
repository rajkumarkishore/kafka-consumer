package com.kishore.kafka.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventConsumeController {
	
	@Autowired
	private MessageConsumer consumer;

	@GetMapping(path = "/event-messages")
	public List<String> home() {
		List<String> messages = consumer.getMessages();
		return messages ;
	}

}
