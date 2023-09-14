package com.example.demo2.controller;


import com.example.demo2.entity.Subject;
import com.example.demo2.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }


    //Adding subject
    @PostMapping("/add")
    private Subject addSubject(@RequestBody Subject subject){
        return subjectService.addSubject(subject);
    }

    //Retrieve data
    @GetMapping("/all")
    private List<Subject> getSubject(){
        return subjectService.getAllSubject();
    }

}
