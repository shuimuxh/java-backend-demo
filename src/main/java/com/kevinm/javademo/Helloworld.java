package com.kevinm.javademo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@EnableAutoConfiguration
@Slf4j
public class Helloworld {
	

	@Value("${url.orderUrl}")
	private String orderUrl;

    @RequestMapping("/")
    String sayHello() {
    	log.info("start say hello");
    	log.debug("orderUrl=====" + orderUrl);
    	log.info("end say hello");
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Helloworld.class, args);
    }
}