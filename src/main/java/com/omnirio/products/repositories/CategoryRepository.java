package com.omnirio.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.omnirio.products.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}