package com.example.SGP.services;

import com.example.SGP.entities.Product;
import com.example.SGP.repository.ProductResository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductResository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
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
