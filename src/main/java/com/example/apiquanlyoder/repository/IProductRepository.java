package com.example.apiquanlyoder.repository;

import com.example.apiquanlyoder.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {
    Iterable<Product>findAllByOrderByPrice();
    Iterable<Product>findAllByPriceBetween(int from, int two);
    Iterable<Product>findAllByNameContaining(String name);
}
