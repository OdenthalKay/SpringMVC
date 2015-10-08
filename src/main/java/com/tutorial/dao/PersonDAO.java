package com.tutorial.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutorial.domain.Person;

@Repository
public class PersonDAO extends HibernateDAO<Person>implements IPersonDAO {

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePerson(Person person) {
		save(person);
	}

}
