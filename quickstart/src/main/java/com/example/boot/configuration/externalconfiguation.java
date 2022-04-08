package com.example.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import external.foo.User;

@Configuration
public class externalconfiguation {
	@Bean
	public User user()
	{
		return new User("John","Mathue","kkkk");
		
	}
}
