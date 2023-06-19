package com.example.springdatajpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpatutorial.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
