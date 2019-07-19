package com.microservices.learning.limitservice.bean;

public class LimitConfiguration {

	private int minimum;
	private int maximum;

	public LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
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
		return "LimitConfiguration [minimum=" + minimum + ", maximum=" + maximum + "]";
	}

}
