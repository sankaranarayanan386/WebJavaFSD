package com.example.web.demoJavaFSD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.demoJavaFSD.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
