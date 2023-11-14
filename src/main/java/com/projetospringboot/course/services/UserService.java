package com.projetospringboot.course.services;

import com.projetospringboot.course.entities.User;
import com.projetospringboot.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
