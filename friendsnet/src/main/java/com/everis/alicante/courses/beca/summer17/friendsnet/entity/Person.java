package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "person")
public class Person implements FNEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Getter
	@Setter
	private String name;

	@NotNull
	@Getter
	@Setter
	private String surname;


	@Getter
	@Setter
	private byte[] picture;
	
	
	public Person(long id) { 
	    this.id = id;
	  }
	  
	  public Person(String name, String surname, byte[] picture) {
	    this.surname = surname;
	    this.name = name;
	    this.picture = picture;
	  }

	public Person() {
		// TODO Auto-generated constructor stub
	}
	  
}
