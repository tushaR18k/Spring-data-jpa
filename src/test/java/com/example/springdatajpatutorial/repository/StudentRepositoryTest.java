package com.example.springdatajpatutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdatajpatutorial.entity.Guardian;
import com.example.springdatajpatutorial.entity.Student;

@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                        .emailId("t19@gmail.com")
                        .firstName("Tushar")
                        .lastName("kansal").build();
                        //.guardianEmail("gp@1.com")
                        //.guardianName("NIkhni")
                        //.guardianMobile("999999").build();

        studentRepository.save(student);
    }

    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder().email("zeze").name("ggrr").mobile("999").build();
        Student student = Student.builder().firstName("temp").lastName("temp2").emailId("pepe")
                    .guardian(guardian)
                    .build();
        studentRepository.save(student);

    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("tushar");
        System.out.println("students: "+ students);
    }

     @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students = studentRepository.findByFirstNameContaining("sh");
        System.out.println("students: "+ students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Nikhil");
        System.out.println(students);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        
        System.out.println("StudentList: " + studentList);
    }

    @Test
    public void printGetStudentByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress("ab@.com");
        System.out.println(student);
    }
}
