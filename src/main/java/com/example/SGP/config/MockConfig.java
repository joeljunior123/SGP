package com.example.SGP.config;

import com.example.SGP.entities.Product;
import com.example.SGP.repository.ProductResository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("mock")
public class MockConfig implements CommandLineRunner {

    @Autowired
    private ProductResository productResository;


    @Override
    public void run(String... args) throws Exception {
        List<Product> products = new ArrayList<>();

        products.add(new Product(null, "Coca-Cola Zero", 2.50, "Coca Cola Zero Lata", "image1.png"));

        productResository.saveAll(products);
    }
}
