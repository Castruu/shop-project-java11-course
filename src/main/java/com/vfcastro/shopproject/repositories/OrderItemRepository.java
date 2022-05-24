package com.vfcastro.shopproject.repositories;


import com.vfcastro.shopproject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
