package com.kevinm.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@EnableAutoConfiguration
public class Helloworld {

	@RequestMapping("/")
	String sayHello() {
		String hostName = System.getenv("HOSTNAME");
		// get the os name
		String os = System.getProperty("os.name");
		System.out.println("hostname="+hostName);
		System.out.println("os="+os);

		// if the application is not running in a docker container, we can to obtain the
		// hostname using the "java.net.InetAddress" class
		if (hostName == null || hostName.isEmpty()) {
			try {
				InetAddress addr = InetAddress.getLocalHost();
				hostName = addr.getHostName();
			} catch (Exception e) {
				System.err.println(e);
				hostName = "Unknow";
			}
		}
		return "Hello World!" + hostName;
	}

	public static void main(String[] args) {
		SpringApplication.run(Helloworld.class, args);
	}
}