package com.omnirio.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.omnirio.products.entities.Attribute;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long>{

}
