package com.example.springdatajpatutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springdatajpatutorial.entity.Course;
import com.example.springdatajpatutorial.entity.Teacher;

public class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course course = Course.builder().title("DBA").credit(5).build();
        Course coursea = Course.builder().title("Java").credit(5).build();

        Teacher teacher = Teacher.builder().firstName("sks").lastName("khan")//.courses(List.of(course,coursea)).
                                                            .build();

         teacherRepository.save(teacher);                                       
    }
}
