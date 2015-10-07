package com.tutorial.dao;

import java.util.List;

import com.tutorial.domain.Person;

public interface IPersonDAO {
	public List<Person> getAllPersons();

	public void save(Person person);
}
