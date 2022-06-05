package com.kevinm.javademo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Speaker {
	
	private static final Logger logger 
	  = LoggerFactory.getLogger(Speaker.class);
	
	
	@Value("${url.orderUrl}")
	private String orderUrl;
	
	@GetMapping("/test")
	public String index() {
		logger.info("start saying");
		logger.debug("orderUrl=====" + orderUrl);
		logger.info("end saying");
		return "Greetings from Spring Boot!";
	}

}
