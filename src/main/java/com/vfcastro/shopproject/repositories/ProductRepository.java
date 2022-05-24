package com.vfcastro.shopproject.repositories;

import com.vfcastro.shopproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
