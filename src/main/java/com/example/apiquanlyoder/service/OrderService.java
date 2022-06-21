package com.example.apiquanlyoder.service;

import com.example.apiquanlyoder.model.Order;
import com.example.apiquanlyoder.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class OrderService implements IOrderService{
    @Autowired
private IOrderRepository orderRepository;
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public void remove(Long id) {
orderRepository.deleteById(id);
    }
}
