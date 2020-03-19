package com.arnesi.swagger.swaggerdemo.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.arnesi.swagger.swaggerdemo.model.Person;
import com.arnesi.swagger.swaggerdemo.util.PersonUtils;

@Service
public class SimpleSwaggerDemoServiceImpl implements SimpleSwaggerDemoService {
	
	private static final Logger logger = LogManager.getLogger(SimpleSwaggerDemoServiceImpl.class);
	
	@Override
	public Person findById(String id) {
		logger.info("Find person with id: {}", id);
		
		return PersonUtils.createPersons(1).get(0);
	}

	@Override
	public List<Person> findAll() {
		 logger.info("Find all persons");
		 
		 return PersonUtils.createPersons(15);
	}

	@Override
	public Person save(Person person) {
		logger.info("Create person");
		
		return PersonUtils.createPersons(1).get(0);
	}

	@Override
	public Person update(Person person) {
		logger.info("Update person id: {}", person.getId());

		return PersonUtils.createPersons(1).get(0);
	}

	@Override
	public void delete(String id) {
		logger.info("Delete person id: {}", id);
	}
}