package com.example.beantests;

public class TestBean {

	private String testProperty;

	public TestBean(TestProperties testProperties) {
		this.testProperty = testProperties.getProperty();
	}

	public String getTestProperty() {
		return testProperty;
	}

}
