package com.example.studentmanagmentsystem;

import com.example.studentmanagmentsystem.entity.Student;
import com.example.studentmanagmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagmentSystemApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        /*Student student1=new Student("Gleb", "Kotruntsev", "kotruntsev.gleb@yandex.ru");
        studentRepository.save(student1);
        Student student2=new Student("Yana", "Averyanova", "averyanova.yana@yandex.ru");
        studentRepository.save(student2);
        Student student3=new Student("Ploskov", "Alexey", "ploskov.alexey@yandex.ru");
        studentRepository.save(student3);*/
    }
}
