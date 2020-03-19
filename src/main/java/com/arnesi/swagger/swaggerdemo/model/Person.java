package com.arnesi.swagger.swaggerdemo.model;

import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Person {

	@NotNull(message = "ID cannot be null")
	@Min(value = 0, message = "Id should not be less than 0")
	@Max(value = 999, message = "Id should not be greater than 999")
	private final Integer id;

	@NotNull(message = "First Name cannot be null")
	private final String firstName;

	@NotNull(message = "Last Name cannot be null")
	private final String lastName;

	@NotEmpty(message = "Hobbies collection cannot be empty")
	private final Map<String, String> hobbies;

	public Person(Integer id, String firstName, String lastName, Map<String, String> hobbies) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hobbies = hobbies;
	}

	public Person(Builder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.hobbies = builder.hobbies;
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Map<String, String> getHobbies() {
		return hobbies;
	}

	/* Person Builder */
	public static class Builder {
		private Integer id;
		private String firstName;
		private String lastName;
		private Map<String, String> hobbies;

		public Builder() {

		}

		public Person build() {
			return new Person(this);
		}

		public Builder id(Integer id) {
			this.id = id;
			return this;
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder hobbies(Map<String, String> hobbies) {
			this.hobbies = hobbies;
			return this;
		}
	}
}