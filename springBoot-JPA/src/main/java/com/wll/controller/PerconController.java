package com.wll.controller;

import com.wll.dao.PersonRepository;
import com.wll.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PerconController {

	@Autowired
	private PersonRepository personRepository;

	@PostMapping("/")
	public void addPerson(@RequestBody Person person) {
		personRepository.save(person);
	}

	@GetMapping("/")
	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Person getPerson(@PathVariable("id") Long id) {
		return personRepository.findById(id).get();
	}

	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable("id") Long id) {
		personRepository.deleteById(id);
	}

	@PutMapping("/")
	public void updatePerson(@RequestBody Person person) {
		personRepository.saveAndFlush(person);
	}

}