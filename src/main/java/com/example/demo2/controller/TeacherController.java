package com.example.demo2.controller;

import com.example.demo2.entity.Teacher;
import com.example.demo2.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }


    //adding teachers

    @GetMapping("/all")
    public List<Teacher> getAllTeacher(){
        return teacherService.findAllTeacher();
    }

    //Adding Teacher data
    @PostMapping("/add")
    private Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
}
