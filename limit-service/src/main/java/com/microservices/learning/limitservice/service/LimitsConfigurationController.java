package com.microservices.learning.limitservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.learning.limitservice.bean.LimitConfiguration;
import com.microservices.learning.limitservice.configuration.Configuration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(name = "/limits", produces = { MediaType.APPLICATION_JSON_VALUE })
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

	@GetMapping("/error-limit")
	@HystrixCommand(fallbackMethod = "errorPrint")
	public LimitConfiguration LimitThrow() {
		throw new RuntimeException("Not Available");
	}

	public LimitConfiguration errorPrint() {
		return new LimitConfiguration(011111111, 01111);
	}
	
}
