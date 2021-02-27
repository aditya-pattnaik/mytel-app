package com.test.mytel.calldetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CallDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallDetailsApplication.class, args);
	}
}
