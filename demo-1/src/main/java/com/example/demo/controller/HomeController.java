package com.example.demo.controller;

import com.example.demo.service.GreetingService;

public class HomeController {
	private GreetingService service;
	// 생성자
	public HomeController(GreetingService service) {
		this.service = service;
		System.out.println("HomeController 생성자");
		
		execute();
	}
	
	// setter
	public void setService(GreetingService service) {
		this.service = service;
	}


	public void execute() {
		service.sayHello();
	}
}
