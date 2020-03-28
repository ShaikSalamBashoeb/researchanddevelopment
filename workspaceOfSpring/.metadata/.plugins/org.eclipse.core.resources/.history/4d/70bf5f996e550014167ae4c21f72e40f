package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//@Table(name="PERSON")
public class Person {
	
	private String name;
	@Id
	private int person_id;

	public Person(int i, String string) {
		setPerson_id(i);
		name = string;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public int getPerson_id() {
		return person_id;
	}

}
