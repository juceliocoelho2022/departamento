package com.desenvolvedor.java.departamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desenvolvedor.java.departamento.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
}
