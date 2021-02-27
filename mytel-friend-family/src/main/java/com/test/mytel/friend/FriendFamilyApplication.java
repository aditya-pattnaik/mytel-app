package com.test.mytel.friend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FriendFamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendFamilyApplication.class, args);
	}
}
