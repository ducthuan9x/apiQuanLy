package com.example.apiquanlyoder.repository;

import com.example.apiquanlyoder.model.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface IOrderRepository extends PagingAndSortingRepository<Order, Long> {
}
