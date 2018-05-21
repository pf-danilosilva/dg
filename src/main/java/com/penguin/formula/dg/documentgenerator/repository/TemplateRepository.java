package com.penguin.formula.dg.documentgenerator.repository;

import com.penguin.formula.dg.documentgenerator.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository  extends JpaRepository<Template, Long> {

	Template findTemplateByName (String name);
}
