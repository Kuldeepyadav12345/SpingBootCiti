package com.example.boot;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import external.foo.User;
//@enableAutoConfiguration automatically configure your spring bott application based on the jars you have added in your project
@EnableAutoConfiguration
@ComponentScan
@Configuration // indicate that the class with declared been methods, will be used to create beans that are part of spring IOC container
public class ApplicationConfiguration {


	public static void main(String[] args) {
		// SpringApplication will bootstrap the application with the configurations 
		ConfigurableApplicationContext ac= SpringApplication.run(ApplicationConfiguration.class, args);
		User bean=(User) ac.getBean("user");
		System.out.println(bean.toString());
	}

}
