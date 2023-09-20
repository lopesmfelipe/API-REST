package com.mywebsite.ecommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// essas duas annotations abaixo vão configurar essa classe para que ela responda via web.
@RestController
@RequestMapping(value = "/products")// vai responder pela rota "/products"
public class ProductController {

// para que esse método responda pela rota "/products" e pelo método HTTP "GET", se usa "@GetMapping"
    @GetMapping
    public String test() {
        return "The world is yours!";
    }

    /* Endpoint com a rota "/products": "http://localhost:8080/products" */

}
