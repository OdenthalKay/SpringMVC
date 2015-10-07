package com.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.tutorial.config.MvcConfiguration;
import com.tutorial.dao.IPersonDAO;
import com.tutorial.domain.Person;

@Service
public class PersonManager implements IPersonManager {
	@Autowired
	IPersonDAO personDAO;

	@Override
	public List<Person> getAllPersons() {
		Person p = new Person("max");
		personDAO.save(p);
		return null;
	}

	@Override
	public void save(Person person) {
		personDAO.save(person);
	}

}
