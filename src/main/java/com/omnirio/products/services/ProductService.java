package com.omnirio.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omnirio.products.entities.Product;
import com.omnirio.products.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}

	public Product getProductById(Long id) {
		return productRepository.getById(id);
	}

	public void createProduct(Product product) {
		productRepository.save(product);
	}

}
