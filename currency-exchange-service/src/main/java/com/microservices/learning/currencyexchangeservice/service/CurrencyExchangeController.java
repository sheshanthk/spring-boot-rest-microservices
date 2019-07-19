package com.microservices.learning.currencyexchangeservice.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.learning.currencyexchangeservice.bean.ExchangeValue;
import com.microservices.learning.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeValueRepository exchangeValueRepository;

	@GetMapping("/currency-exchange-service/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		/*
		 * ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to,
		 * BigDecimal.valueOf(75));
		 */
		ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);

		logger.info("{}", exchangeValue);
		
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

		return exchangeValue;
	}

}
