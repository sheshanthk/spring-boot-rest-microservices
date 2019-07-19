package com.microservices.learning.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableHystrix
public class LimitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitServiceApplication.class, args);
	}

}
