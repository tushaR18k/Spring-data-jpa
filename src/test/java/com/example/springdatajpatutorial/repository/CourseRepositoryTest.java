package com.example.springdatajpatutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import com.example.springdatajpatutorial.entity.Course;

public class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){
        List<Course> courses = courseRepository.findAll();
        System.out.println(courses);
        
    }

    @Test
    public void findAllPagination(){
        org.springframework.data.domain.Pageable firstPageWithThreeRecords = PageRequest.of(0,3);
        org.springframework.data.domain.Pageable secondPageWithTwoRecords = PageRequest.of(1,2);

    }
}
