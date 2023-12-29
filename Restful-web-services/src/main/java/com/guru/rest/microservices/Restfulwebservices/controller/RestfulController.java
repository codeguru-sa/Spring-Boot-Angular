package com.guru.rest.microservices.Restfulwebservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.guru.rest.microservices.Restfulwebservices.model.HelloWorldBean;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RestfulController {
		@GetMapping(path="/hello-world")
		public String helloWorld() {
			return "Hello World";
		}
		
		@GetMapping(path="/hello-world-bean")
		public HelloWorldBean helloWorldBean(String message) {
			//throw new RuntimeException("Some error happend ! contact support team..");
			return new HelloWorldBean("Hello-World-bean");
		}
		
		@GetMapping(path="/hello-world-bean/{name}")
		public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
			return new HelloWorldBean(String.format("Hello-World-bean, %s",name));
		}
		
}
