package com.example.apiquanlyoder.service;

import com.example.apiquanlyoder.model.OrderDetai;
import com.example.apiquanlyoder.repository.IOrderDetaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class OrderDetaiService implements IOrderDetaiService{
    @Autowired
    private IOrderDetaiRepository orderDetaiRepository;
    public Iterable<OrderDetai> findAll() {
        return orderDetaiRepository.findAll();
    }

    public Optional<OrderDetai> findById(Long id) {
        return orderDetaiRepository.findById(id);
    }

    public OrderDetai save(OrderDetai orderDetai) {
        return orderDetaiRepository.save(orderDetai);
    }

    public void remove(Long id) {
orderDetaiRepository.deleteById(id);
    }
}
