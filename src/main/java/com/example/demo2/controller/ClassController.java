package com.example.demo2.controller;


import com.example.demo2.service.ClassService;
import com.example.demo2.entity.Class;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    private final ClassService classService;


    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    //Retrieve Class data
    @GetMapping("/all")
    public List<Class> getAllClass(){
        return classService.getAllClasses();
    }

    //Adding Class
    @PostMapping("/add")
    public Class addClass(@RequestBody Class class1){
        return classService.addClass(class1);
    }



}
