package com.omnirio.products.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omnirio.products.entities.Attribute;
import com.omnirio.products.repositories.AttributeRepository;

@Service
public class AttributeService {
	
	@Autowired
	private AttributeRepository attributeRepository;

	public void createAttribute(Attribute attribute) {
		attributeRepository.save(attribute);
	}

}
