package com.omnirio.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omnirio.products.entities.Attribute;
import com.omnirio.products.entities.Category;
import com.omnirio.products.services.AttributeService;
import com.omnirio.products.services.CategoryService;

@RestController
public class AttributeController {
	
	@Autowired
	private AttributeService attributeService;
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("attributes/category/{categoryId}")
	public void createAttribute(@PathVariable Long id, @RequestBody Attribute attribute) {
		Category category = categoryService.getCategoryById(id);
		attribute.setCategory(category);
		attributeService.createAttribute(attribute);
	}

}
