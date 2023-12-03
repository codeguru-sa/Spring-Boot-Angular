package com.guru.rest.microservices.Restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {
		@GetMapping(path="/hello-world")
		public String helloWorld() {
			return "Hello World";
		}
}
