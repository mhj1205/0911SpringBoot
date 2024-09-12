package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
		@GetMapping
		public String testController() {
			return "GET - /test";
		}
		
		@PostMapping
		public String postController() {
			return "POST - /test";
		}
		
		@GetMapping("/{id}")
		public String pathVariabls(@PathVariable(required = true) int id) {
			return "Hello World! Path Variables ID : " + id;
		}

		@GetMapping("/requestParam")
		public String requestParm(@RequestParam(required = true) int id) {
			return "Hello World! Request Param ID : " + id;
		}



}
