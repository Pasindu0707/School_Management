package com.example.demo2.service;

import com.example.demo2.entity.Student;

import java.util.List;

public interface StudentService {
    //to add Student
    Student addStudent(Student student);

    //To get all the Students
    List<Student> findAllStudent();

    //Update
    Student updateStudent(Student student);

    //delete
    void deleteStudent (int id);

    //find by id
    Student findStudentById(int id);


    Student addStudentName(String name);

    Student addStudentContcat(String contact);
}
