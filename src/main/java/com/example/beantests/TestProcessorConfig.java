package com.example.beantests;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestProcessorConfig {

	@Bean
	static TestPostProcessor testPostProcessor(ObjectProvider<TestBean> provider) {
		return new TestPostProcessor(provider);
	}

	private static class TestPostProcessor implements BeanDefinitionRegistryPostProcessor {

		private final ObjectFactory<TestBean> provider;

		private TestPostProcessor(ObjectFactory<TestBean> provider) {
			this.provider = provider;
		}

		@Override
		public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		}

		@Override
		public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
			try {
				// Comment this out to get it working
				provider.getObject();
			} catch (BeansException e) {

			}
		}

	}


}
