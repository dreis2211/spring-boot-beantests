package com.example.beantests;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

@Configuration
@EnableConfigurationProperties(TestProperties.class)
public class TestConfig {

	@Bean
	public TestBean testBean(TestProperties testProperties) {
		Assert.notNull(testProperties.getProperty(), "Test property should not null");
		return new TestBean(testProperties);
	}

}
