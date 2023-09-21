package com.mywebsite.ecommerce.repositories;

import com.mywebsite.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
