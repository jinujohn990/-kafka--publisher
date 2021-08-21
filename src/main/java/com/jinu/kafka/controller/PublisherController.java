package com.jinu.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jinu.kafka.dto.User;

@RestController
public class PublisherController {

	@Autowired
	KafkaTemplate<String, Object> template;
	
	public static final String TOPIC = "testTopic";

	@GetMapping("/publish/{name}")
	public String publishMessge(@PathVariable("name") String name) {
		template.send(TOPIC, "Hi " + name);
		return "name published";
	}

	@GetMapping("/publishObject/{username}")
	public String publishObject(@PathVariable("username") String username) {
		User user = new User(username, username + "@gmail.com");
		template.send(TOPIC, user);
		return "User object published";
	}
}
