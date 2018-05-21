package com.penguin.formula.dg.documentgenerator.model;

import java.util.Date;

public class Experience {

	private Long id;

	private String name;

	private String project;

	private String sector;

	private Date startDate;

	private Date endDate;

	public Experience() {
	}

	public Experience(Long id, String name, String project, String sector, Date startDate, Date endDate) {
		this.id = id;
		this.name = name;
		this.project = project;
		this.sector = sector;
		this.startDate = startDate;
		this.endDate = endDate;
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

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
