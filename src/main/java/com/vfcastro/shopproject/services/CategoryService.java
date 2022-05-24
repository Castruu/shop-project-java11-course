package com.vfcastro.shopproject.services;

import com.vfcastro.shopproject.entities.Category;
import com.vfcastro.shopproject.entities.Order;
import com.vfcastro.shopproject.repositories.CategoryRepository;
import com.vfcastro.shopproject.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {


    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.categoryRepository = repository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    public Category findById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Entity not found"
        ));
    }

}
