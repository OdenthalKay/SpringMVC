package com.tutorial.service;

import java.util.List;

import com.tutorial.domain.Person;

public interface IPersonManager {
	Person getPersonById(int id);
	List<Person> getAllPersons();
	void save(Person person);
}
