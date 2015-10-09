package com.tutorial.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutorial.domain.Person;

@Repository
public class PersonDAO extends HibernateDAO<Person>implements IPersonDAO {

	@Override
	public Person getPersonById(int id) {
		return findById(Person.class.getName(), id);
	}

	@Override
	public List<Person> getAllPersons() {
		return findAll(Person.class.getName());
	}

	@Override
	public void savePerson(Person person) {
		save(person);
	}

}
