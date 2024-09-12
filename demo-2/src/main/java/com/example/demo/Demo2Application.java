package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.demo.controller.HomeController;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo2Application.class, args);
		
		HomeController homeController = context.getBean(HomeController.class);
		homeController.execute();
		
	}

}
