package com.everis.alicante.courses.beca.summer17.friendsnet.controller.config;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RestController
@RequestMapping("/persons")
public class PersonController {

	private PersonManager manager;

	@GetMapping
	public List<Person> getAll() {
		return null;
	}

	@GetMapping("/{id}")
	public Person getById(@RequestParam Long id) {
		return null;
	}

	@PostMapping
	public Person create(@RequestBody Person person) {
		return null;
	}

	@PostMapping("/{id}/relate")
	public Person relate(@RequestParam Long id, @RequestBody List<Person> persons) {
		return null;
	}

	@DeleteMapping("/{id}")
	public void remove (@RequestParam Long id) {
		
	}
}