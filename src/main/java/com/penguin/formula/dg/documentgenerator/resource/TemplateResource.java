package com.penguin.formula.dg.documentgenerator.resource;

import com.penguin.formula.dg.documentgenerator.model.Template;
import com.penguin.formula.dg.documentgenerator.service.TemplateService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/templates")
@Api(value = "Templates", description = "EndPoints for template management")
public class TemplateResource {

	@Autowired
	private TemplateService templateService;


	@GetMapping
	public List<Template> findAll(){
		return templateService.findAll();
	}

	@PostMapping
	public Template save(Template template){
		return templateService.save(template);
	}


}
