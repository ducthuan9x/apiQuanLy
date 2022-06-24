package com.example.apiquanlyoder.service;

import com.example.apiquanlyoder.model.Product;

public interface IProductService extends IGeneralService<Product>{
    Iterable<Product>findAllByOrderByPrice();
    Iterable<Product>findAllByPriceBetween(int from, int two);
    Iterable<Product>findAllByNameContaining(String name);
}
