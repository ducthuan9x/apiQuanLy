package com.example.apiquanlyoder.repository;

import com.example.apiquanlyoder.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {
}
