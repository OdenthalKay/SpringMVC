package com.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorial.domain.Person;

@Service
public class PersonManager implements IPersonManager {

	@Override
	public List<Person> getAllPersons() {
		List<Person> persons = new ArrayList<Person>();
		Person p1 = new Person("kay");
		Person p2 = new Person("max");
		Person p3 = new Person("dennis");
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		return persons;
	}

}
