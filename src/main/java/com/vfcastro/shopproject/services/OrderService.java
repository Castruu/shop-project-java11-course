package com.vfcastro.shopproject.services;

import com.vfcastro.shopproject.entities.Order;
import com.vfcastro.shopproject.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.orderRepository = repository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Entity not found"
        ));
    }

}
