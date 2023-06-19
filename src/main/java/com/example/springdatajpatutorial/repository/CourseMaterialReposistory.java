package com.example.springdatajpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpatutorial.entity.CourseMaterial;

public interface CourseMaterialReposistory extends JpaRepository<CourseMaterial,Long>{
    
}
