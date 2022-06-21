package com.example.apiquanlyoder.service;

import com.example.apiquanlyoder.model.Product;
import com.example.apiquanlyoder.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository productRepository;
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void remove(Long id) {
        productRepository.deleteById(id);
    }
}
