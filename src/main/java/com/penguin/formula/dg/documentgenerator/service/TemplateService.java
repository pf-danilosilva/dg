package com.penguin.formula.dg.documentgenerator.service;

import com.penguin.formula.dg.documentgenerator.model.Template;

import java.util.List;

public interface TemplateService {


	List<Template> findAll();

	Template save(Template template);
}
