package com.example.demo2.service;

import com.example.demo2.entity.Subject;

import java.util.List;

public interface SubjectService {

    //to add subjects
    Subject addSubject(Subject subject);

    //to get subjects
    List<Subject> getAllSubject();

    Subject addSubjectName(String subName);
}

