package com.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tutorial.domain.Person;
import com.tutorial.service.IPersonManager;

@Controller
@RequestMapping("/rest")
public class PersonController {
	@Autowired
	IPersonManager personManager;

	@RequestMapping(value = "/person", method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Person savePerson(@RequestBody Person person) {
		personManager.save(person);
		return person;
	}

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String getAllPersons() {
		List<Person> persons = personManager.getAllPersons();
		return persons.toString();
	}
}