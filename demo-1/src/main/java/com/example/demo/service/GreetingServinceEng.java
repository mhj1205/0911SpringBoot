package com.example.demo.service;

public class GreetingServinceEng implements GreetingService {

	public GreetingServinceEng() {
		System.out.println(">>> GreetingServiceEng constructor");
	}
	
	@Override
	public void sayHello() {
		System.out.println(">>> Hello world");
	}

}
