package com.example.demo2.repository;

import com.example.demo2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    Student findStudentByStudentID(int studentID);

    void deleteStudentByStudentID(int studentID);
}
