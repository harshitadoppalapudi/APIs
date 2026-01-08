package com.example.mary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mary.model.Animal;

public interface AnimalRepo extends JpaRepository<Animal,Long> {
    
}
