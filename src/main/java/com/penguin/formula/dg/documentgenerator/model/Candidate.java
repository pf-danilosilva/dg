package com.penguin.formula.dg.documentgenerator.model;

import java.util.Date;

public class Candidate {

	private Long id;

	private String name;

	private String email;

	private Date birthDate;

	public Candidate(Long id, String name, String email, Date birthDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public Candidate() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
