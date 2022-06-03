package com.kevinm.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Helloworld {

    @RequestMapping("/")
    String sayHello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Helloworld.class, args);
    }
}