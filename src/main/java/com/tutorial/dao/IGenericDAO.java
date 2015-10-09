package com.tutorial.dao;

import java.util.List;

public interface IGenericDAO<T> {

	List<T> findAll(String className);

	void save(T entity);

	T findById(String className, int id);
}
