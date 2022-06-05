package com.kevinm.javademo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class SpeakerLombok {
	
	
	@GetMapping("/test2")
	public String index() {
    	log.info("start say hello");
    	log.info("end say hello");		
		return "hello world!";
	}

}
