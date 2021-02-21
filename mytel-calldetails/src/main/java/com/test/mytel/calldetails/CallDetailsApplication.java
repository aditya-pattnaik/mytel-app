package com.test.mytel.calldetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class CallDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallDetailsApplication.class, args);
	}
}
