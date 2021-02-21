package com.test.mytel.friend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class FriendFamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendFamilyApplication.class, args);
	}
}
