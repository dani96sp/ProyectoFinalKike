package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

@RestController
@RequestMapping("/person")
public interface PersonManager extends Manager<Person, Long> {
	public Person relatePerson(Person person, Iterable<Person> persons);
	

}
