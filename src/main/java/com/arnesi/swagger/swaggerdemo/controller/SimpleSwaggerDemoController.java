package com.arnesi.swagger.swaggerdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arnesi.swagger.swaggerdemo.model.Person;
import com.arnesi.swagger.swaggerdemo.service.SimpleSwaggerDemoService;

@RestController
public class SimpleSwaggerDemoController {
	
	private final SimpleSwaggerDemoService service;
	
	public SimpleSwaggerDemoController(SimpleSwaggerDemoService service) {
		this.service = service;
	}
	
	 @GetMapping("/person/{id}")
	 public Person getPerson(@PathVariable String id) {
		 return service.findById(id);
	 }
	 
	 @GetMapping("/person/all")
	 public List<Person> getAllPerson() {
		 return service.findAll();
	 }
	 
	 @PostMapping("/person/create")
	 public Person createPerson(@RequestBody @Valid Person person) {
		return service.save(person);
	 }
	 
	 @PutMapping("/person/update/{id}")
	 public Person updatePerson(@RequestBody Person person) {
		 return service.update(person);
	 }
	 
	 @DeleteMapping("/person/{id}")
	 public void deletePerson(@PathVariable String id) {
		 service.delete(id);	
	 }
}