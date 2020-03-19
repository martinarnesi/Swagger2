package com.arnesi.swagger.swaggerdemo.service;

import java.util.List;

import com.arnesi.swagger.swaggerdemo.model.Person;

public interface SimpleSwaggerDemoService {

	/* Simple GET */
	Person findById(String id);

	List<Person> findAll();

	/* Simple POST */
	Person save(Person person);

	/* Simple PUT */
	Person update(Person update);

	/* Simple DELETE */
	void delete(String id);
}