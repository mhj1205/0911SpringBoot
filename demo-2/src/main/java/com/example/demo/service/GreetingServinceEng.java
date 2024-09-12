package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServinceEng implements GreetingService {

	public GreetingServinceEng() {
		System.out.println(">>> GreetingServiceEng constructor");
	}
	
	@Override
	public void sayHello() {
		System.out.println(">>> Hello world");
	}
	
	@Override
	public Object getGreeting() {
		return ">>> Hello world";
	}

}
