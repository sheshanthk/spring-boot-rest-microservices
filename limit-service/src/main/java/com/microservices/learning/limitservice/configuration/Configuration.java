package com.microservices.learning.limitservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;

@Controller
@ConfigurationProperties("limit-service")
public class Configuration {

	private int minimum;
	private int maximum;

	public Configuration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Configuration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	@Override
	public String toString() {
		return "Configuration [minimum=" + minimum + ", maximum=" + maximum + "]";
	}

}
