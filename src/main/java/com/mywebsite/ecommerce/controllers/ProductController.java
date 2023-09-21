package com.mywebsite.ecommerce.controllers;

import com.mywebsite.ecommerce.entities.Product;
import com.mywebsite.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;


@RestController // essas duas annotations vão configurar essa classe para que ela responda via web.
@RequestMapping(value = "/products")// vai responder pela rota "/products"
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public String test() {
        Optional<Product> result = repository.findById(2L);  // esse 'result' é o resultado da consulta no banco de dados
        Product product = result.get(); // esse '.get' pega o objeto que esta dentro do Optional, e estamos passando esse resultado para um objeto 'product'
        return product.getName();
    }
}
