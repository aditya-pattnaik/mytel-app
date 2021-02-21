package com.test.mytel.plan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class PlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanApplication.class, args);
	}
}
