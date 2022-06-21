package com.example.apiquanlyoder.controller;

import com.example.apiquanlyoder.model.OrderDetai;
import com.example.apiquanlyoder.model.Product;
import com.example.apiquanlyoder.service.IOrderDetaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orderDetais")
public class OrderDetaiController {
    @Autowired
    private IOrderDetaiService orderDetaiService;
    @GetMapping
    public ResponseEntity<Iterable<OrderDetai>> findAllOrderDetai() {
        List<OrderDetai> orderDetai = (List<OrderDetai>) orderDetaiService.findAll();
        if (orderDetai.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(orderDetai, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<OrderDetai> findOrderDetaitById(@PathVariable Long id) {
        Optional<OrderDetai> orderDetaiOptional = orderDetaiService.findById(id);
        if (!orderDetaiOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(orderDetaiOptional.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OrderDetai> saveOrderDetai(@RequestBody OrderDetai orderDetai) {
        return new ResponseEntity<>(orderDetaiService.save(orderDetai), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDetai> updateOrderDetai(@PathVariable Long id, @RequestBody OrderDetai orderDetai) {
        Optional<OrderDetai> orderDetaiOptional = orderDetaiService.findById(id);
        if (!orderDetaiOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        orderDetai.setId(orderDetaiOptional.get().getId());
        return new ResponseEntity<>(orderDetaiService.save(orderDetai), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrderDetai> deleteOrderDetai(@PathVariable Long id) {
        Optional<OrderDetai> orderDetaiOptional = orderDetaiService.findById(id);
        if (!orderDetaiOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        orderDetaiService.remove(id);
        return new ResponseEntity<>(orderDetaiOptional.get(), HttpStatus.NO_CONTENT);
    }
}
