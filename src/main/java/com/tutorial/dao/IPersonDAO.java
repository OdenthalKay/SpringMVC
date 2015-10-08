package com.tutorial.dao;

import java.util.List;

import com.tutorial.domain.Person;

public interface IPersonDAO {
	Person getPersonById(int id);

	List<Person> getAllPersons();

	void savePerson(Person person);
}
