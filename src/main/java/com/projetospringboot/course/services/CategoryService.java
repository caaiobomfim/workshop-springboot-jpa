package com.projetospringboot.course.services;

import com.projetospringboot.course.entities.Category;
import com.projetospringboot.course.entities.User;
import com.projetospringboot.course.repositories.CategoryRepository;
import com.projetospringboot.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
