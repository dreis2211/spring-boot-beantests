package com.example.beantests;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("test")
public class TestProperties {

	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

}
