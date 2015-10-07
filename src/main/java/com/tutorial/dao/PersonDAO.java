package com.tutorial.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.domain.Person;

@Repository
public class PersonDAO extends HibernateDAO implements IPersonDAO {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	@Override
	public List<Person> getAllPersons() {
		// findAllPersons();
		Person person = new Person("max");
		System.out.println(sessionFactory);
		getSession().persist(person);
		return null;
	}

	@Transactional
	@Override
	public void save(Person person) {
		System.out.println(sessionFactory);
		getSession().persist(person);

	}

}
