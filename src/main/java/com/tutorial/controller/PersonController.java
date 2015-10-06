package com.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.domain.Person;
import com.tutorial.service.IPersonManager;
import com.tutorial.service.IRentService;

@RestController
@RequestMapping("/rest")
public class PersonController {
	@Autowired
	IPersonManager personManager;

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String getAllPersons() {
		List<Person> persons = personManager.getAllPersons();
		return persons.toString();
	}
}