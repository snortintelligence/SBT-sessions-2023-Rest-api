package com.snort.intelli.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snort.intelli.app.model.Todos;
import com.snort.intelli.app.repository.TodosRepository;

@RestController
@RequestMapping("/todos")
public class TodosController {

	@Autowired
	TodosRepository todosRepository;

	private Logger log = LoggerFactory.getLogger(TodosController.class);

	@PostMapping("/create")
	public String createTask(@RequestBody Todos todos) {
		log.info("TodosController : createTask executed!");
		return todosRepository.createTask(todos);
	}

	@GetMapping("/")
	public List<Todos> findAll() {
		log.info("TodosController : findAll executed!");
		return todosRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Todos findOneTodo(@PathVariable Long id) {
		log.info("TodosController : findOneTodo executed!");
		Todos todos = todosRepository.findOne(id);
		return todos;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteOneTodo(@PathVariable Long id) {
		log.info("TodosController : deleteOneTodo executed!");
		return todosRepository.deleteOne(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateOneTodo(@PathVariable Long id, @RequestBody Todos newTodo) {
		return todosRepository.update(id, newTodo);
	}
	
}
