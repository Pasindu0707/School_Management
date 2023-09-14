package com.example.demo2.service;

import java.util.List;
import com.example.demo2.entity.Class;
public interface ClassService {

    //To add class
    Class addClass(Class class1);

    // get all the classes
    List<Class> getAllClasses();


    Class addGrade(String grade);
}
