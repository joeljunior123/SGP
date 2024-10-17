package com.example.SGP.repository;

import com.example.SGP.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductResository extends JpaRepository<Product, Long> {
}
