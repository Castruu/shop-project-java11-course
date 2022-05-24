package com.vfcastro.shopproject.repositories;

import com.vfcastro.shopproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
