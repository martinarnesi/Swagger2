package com.arnesi.swagger.swaggerdemo.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.arnesi.swagger.swaggerdemo.model.Person;

public class PersonUtils {
	
	private static final Random rand = new Random();
	
	private PersonUtils() {
		
	}
	
	public static List<Person> createPersons(Integer numberOfPersons) {
		
		final List<Person> personList = new ArrayList<>();
		final Person.Builder builder = new Person.Builder();
		
		for (int i = 0; i < numberOfPersons; i++) {
			builder
				.id(i)
				.firstName(generateRamdonName())
				.lastName(generateRamdonName())
				.hobbies(createRandomHobbies());
			
			personList.add(builder.build());
		}
		
		return personList;
	}
	
	private static Map<String, String> createRandomHobbies() {
		Map<String, String> randomMap = new HashMap<>();
		
		randomMap.put("VideoGames", "El popping es un cambio brusco en el nivel de detalle de un modelo 3D");
		randomMap.put("Motociclismo", "El motociclismo es el uso deportivo de la motocicleta en varias modalidades");
		randomMap.put("Pesca","La pesca es unas de las actividades más practicadas a lo largo de la historia");
		
		return randomMap;
	}
	
	public static String generateRamdonName() {
		List<String> nameList = Arrays.asList("Andrea", "David", "Martin", "Sanchez", "Baldwin", "Baltasar", "Arnesi",
				"Bartolo", "Bartolomé", "Bart", "Simpson", "Candela", "Ylamoto", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Menem");
		return nameList.get(rand.nextInt(nameList.size()));
	}
}