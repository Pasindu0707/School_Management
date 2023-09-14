package com.example.demo2.service.Impl;

import com.example.demo2.entity.Teacher;
import com.example.demo2.repository.TeacherRepo;
import com.example.demo2.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepo teacherRepo;

    public TeacherServiceImpl(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    //To add Teachers
    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    //To get all the Teachers
    @Override
    public List<Teacher> findAllTeacher() {
        return teacherRepo.findAll();
    }

    @Override
    public Teacher addTeacherName(String name) {
        Teacher teacher=new Teacher();
        teacher.setName(name);
        return teacherRepo.save(teacher);
    }
}
