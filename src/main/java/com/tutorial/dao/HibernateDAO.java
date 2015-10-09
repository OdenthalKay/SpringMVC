package com.tutorial.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateDAO<T> implements IGenericDAO<T> {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public T findById(String className, int id) {
		return (T) getSession().get(className, id);
	}

	@Override
	public List<T> findAll(String className) {
		List<T> objects;
	    Query query = getSession().createQuery("from " + className);
        objects = query.list();
		return objects;
	}

	@Override
	public void save(T entity) {
		getSession().save(entity);
	}
}
