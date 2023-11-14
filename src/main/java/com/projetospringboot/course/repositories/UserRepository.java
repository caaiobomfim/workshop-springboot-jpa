package com.projetospringboot.course.repositories;

import com.projetospringboot.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
