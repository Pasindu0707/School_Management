package com.example.demo2.service;

import com.example.demo2.entity.Student;
import com.example.demo2.entity.Teacher;

import java.util.List;

public interface TeacherService {

    //To add teacher
    Teacher addTeacher(Teacher teacher);

    //To get All teacher
    List<Teacher> findAllTeacher();

    Teacher addTeacherName(String name);
}
