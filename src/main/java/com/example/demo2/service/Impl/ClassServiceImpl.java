package com.example.demo2.service.Impl;

import com.example.demo2.repository.ClassRepo;
import com.example.demo2.entity.Class;
import com.example.demo2.service.ClassService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    private final ClassRepo classRepo;

    public ClassServiceImpl(ClassRepo classRepo) {
        this.classRepo = classRepo;
    }

    //To add Class
    @Override
    public Class addClass(Class class1) {
        return classRepo.save(class1);
    }

    //To get all Class
    @Override
    public List<Class> getAllClasses() {
        return classRepo.findAll();
    }

    @Override
    public Class addGrade(String grade) {
        Class class1=new Class();
        class1.setGrade(grade);
        return classRepo.save(class1);
    }


}
