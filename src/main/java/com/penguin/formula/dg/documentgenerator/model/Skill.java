package com.penguin.formula.dg.documentgenerator.model;

public class Skill {

	private  Long id;

	private String nome;

	public Skill(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Skill() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
