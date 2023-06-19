package com.example.springdatajpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpatutorial.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    
}
