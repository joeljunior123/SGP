package com.example.SGP.services;

import com.example.SGP.entities.Product;
import com.example.SGP.exceptions.ResourceNotFoundException;
import com.example.SGP.repository.ProductResository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductResository repository;

    public Page<Product> findAll(int page, int itens){
        return repository.findAll(PageRequest.of(page, itens));
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException("Nenhum produto encontrado com o id: " + id));
    }

    public Page<Product> findByName(String name, int page, int itens){
        Page<Product> products = repository.findByNameContainingIgnoreCase(name, PageRequest.of(page, itens));

        if (products.isEmpty()) {
            throw new ResourceNotFoundException("Nenhum produto encontrado com o nome: " + name);
        }

        return products;
    }

    public Product insert(Product obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Product update(Long id, Product obj){
        Product entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Product entity, Product obj) {
        entity.setName(obj.getName());
        entity.setDesc(obj.getDesc());
        entity.setImage(obj.getImage());
        entity.setPrice(obj.getPrice());
    }
}
