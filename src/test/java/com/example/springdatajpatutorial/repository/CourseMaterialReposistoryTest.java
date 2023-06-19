package com.example.springdatajpatutorial.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdatajpatutorial.entity.Course;
import com.example.springdatajpatutorial.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialReposistoryTest {

    @Autowired
    private CourseMaterialReposistory reposistory;

    @Test
    public void SaveCourseMaterial(){

        Course course = Course.builder().title("DSA").credit(6).build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                                        .url("wwww.").course(course).build();

        reposistory.save(courseMaterial);
    }
}
