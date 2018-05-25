package com.penguin.formula.dg.documentgenerator.service;

import com.penguin.formula.dg.documentgenerator.model.Template;
import com.penguin.formula.dg.documentgenerator.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired
	private TemplateRepository templateRepository;

	@Override
	public List<Template> findAll() {
		return templateRepository.findAll();
	}

	@Override
	public Template save(Template template) {
		return templateRepository.save(template);
	}
}
