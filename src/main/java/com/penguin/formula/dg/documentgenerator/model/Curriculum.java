package com.penguin.formula.dg.documentgenerator.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Curriculum {

	private Long id;

	private List<Skill> skills;

	private List<Experience> experiences;

	private Date availability;

	private List<Language> languages;

	public Curriculum(Long id, List<Skill> skills, List<Experience> experiences, Date availability, List<Language> languages) {
		this.id = id;
		this.skills = skills;
		this.experiences = experiences;
		this.availability = availability;
		this.languages = languages;
	}

	public Curriculum() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public Date getAvailability() {
		return availability;
	}

	public void setAvailability(Date availability) {
		this.availability = availability;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
}
