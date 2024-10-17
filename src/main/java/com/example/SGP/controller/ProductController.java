package com.example.SGP.controller;

import com.example.SGP.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<Product> findAll(){
        Product p = new Product(1L, "Bolacha", 5.50, "Bolacha Oreo", "Teste");
        return ResponseEntity.ok().body(p);
    }
}
