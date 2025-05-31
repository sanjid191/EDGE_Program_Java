package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ApplicationContext context =(ApplicationContext) SpringApplication.run(Application.class, args);
		Dev obj = ((BeanFactory) context).getBean(Dev.class);

		obj.build();
	}

}







