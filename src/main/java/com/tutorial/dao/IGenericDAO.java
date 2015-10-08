package com.tutorial.dao;

import java.util.List;

public interface IGenericDAO<T> {
	T findById(int id);

	List<T> findAll();

	void save(T entity);
}
