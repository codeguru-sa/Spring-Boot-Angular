package com.guru.rest.microservices.Restfulwebservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.guru.rest.microservices.Restfulwebservices.model.Todo;

@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "Guru", "Learn Angular", new Date(), false));
		todos.add(new Todo(++idCounter, "Guru", "Learn about Microservices", new Date(), true));
		todos.add(new Todo(++idCounter, "Guru", "Learn Docker completely", new Date(), false));
		todos.add(new Todo(++idCounter, "Guru", "Learn Spring-boot", new Date(), true));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteTodoById(long id) {
		Todo todo = findById(id);
		if(todo== null) return null;
		if(todos.remove(todo)) {
			return todo;
		};
		return null;
	}

	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}
}
