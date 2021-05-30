package com.omnirio.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omnirio.products.entities.Category;
import com.omnirio.products.entities.Product;
import com.omnirio.products.services.CategoryService;
import com.omnirio.products.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("products/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	
	@PostMapping("products/category/{categoryId}")
	public void createProduct(@PathVariable Long id, @RequestBody Product product) {
		Category category = categoryService.getCategoryById(id);
		product.setCategory(category);
		productService.createProduct(product);
	}

}
