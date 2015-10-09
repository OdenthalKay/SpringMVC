package com.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Entity
public class Person {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String fullname;

	public Person() {
	}
	

	public Person(String fullname) {
		this.fullname = fullname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fullname=" + fullname + "]";
	}

	

}
