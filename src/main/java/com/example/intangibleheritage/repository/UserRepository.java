package com.example.intangibleheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.intangibleheritage.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    // Finder method to find a user by username
    User findByUsername(String username);
    
    // Finder method to find a user by email
    User findByEmail(String email);
    
    // Method to check if a username exists
    boolean existsByUsername(String username);
    
    // Method to check if an email exists
    boolean existsByEmail(String email);
}