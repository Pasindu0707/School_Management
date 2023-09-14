package com.example.demo2.service.Impl;


import com.example.demo2.entity.Subject;
import com.example.demo2.repository.SubjectRepo;
import com.example.demo2.service.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{

    private final SubjectRepo subjectRepo;

    public SubjectServiceImpl(SubjectRepo subjectRepo){
        this.subjectRepo=subjectRepo;
    }

    //Adding new Subject
    @Override
    public Subject addSubject(Subject subject){
        return subjectRepo.save(subject);
    }

    //To get all Subject
    @Override
    public List<Subject> getAllSubject() {
        return subjectRepo.findAll();
    }

    @Override
    public Subject addSubjectName(String subName) {
        Subject subject=new Subject();
        subject.setSubjectName(subName);
        return subjectRepo.save(subject);
    }
}
