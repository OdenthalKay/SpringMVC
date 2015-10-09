package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.dao.IPersonDAO;
import com.tutorial.domain.Person;

@Service
public class PersonManager implements IPersonManager {
	@Autowired
	IPersonDAO personDAO;

	@Transactional
	@Override
	public List<Person> getAllPersons() {
		return personDAO.getAllPersons();
	}

	@Transactional
	@Override
	public void save(Person person) {
		personDAO.savePerson(person);
	}

	@Transactional
	@Override
	public Person getPersonById(int id) {
		return personDAO.getPersonById(id);
	}

}
