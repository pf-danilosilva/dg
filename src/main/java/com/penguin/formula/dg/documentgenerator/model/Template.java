package com.penguin.formula.dg.documentgenerator.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "template")
public class Template {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private Double size;

	private Date modified;

	public Template(Long id, String name, Double size, Date modified) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.modified = modified;
	}

	public Template() {
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

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}
}
