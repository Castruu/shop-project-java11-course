package com.vfcastro.shopproject.services;

import com.vfcastro.shopproject.entities.User;
import com.vfcastro.shopproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Entity not found"
        ));
    }

}
