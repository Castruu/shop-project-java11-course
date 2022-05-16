package com.vfcastro.shopproject.repositories;


import com.vfcastro.shopproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
