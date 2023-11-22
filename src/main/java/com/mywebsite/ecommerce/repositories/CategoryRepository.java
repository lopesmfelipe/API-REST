package com.mywebsite.ecommerce.repositories;

import com.mywebsite.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
