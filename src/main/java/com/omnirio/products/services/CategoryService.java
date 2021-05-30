package com.omnirio.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omnirio.products.entities.Category;
import com.omnirio.products.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public void createCategory(Category category) {
		categoryRepository.save(category);
		
	}

	public Category getCategoryById(Long id) {
		return categoryRepository.getById(id);
	}

}
