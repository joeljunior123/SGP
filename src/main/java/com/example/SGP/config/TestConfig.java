package com.example.SGP.config;

import com.example.SGP.entities.Product;
import com.example.SGP.repository.ProductResository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ProductResository productResository;


    @Override
    public void run(String... args) throws Exception {
        Product p1 = new Product(null, "Coca-Cola Zero", 2.00, "Coca Cola Zero Lata", "image");
        Product p2 = new Product(null, "Coca-Cola", 2.00, "Coca Cola Lata", "image");

        productResository.saveAll(Arrays.asList(p1, p2));
    }
}
