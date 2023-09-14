package com.example.demo2;

import com.example.demo2.entity.Class;
import com.example.demo2.service.ClassService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class ClassTest {

    @Autowired
    private ClassService classService;

    @Test
    public void testAddGrade(){
        String grade="Grade 11";

        Class class1=classService.addGrade(grade);

        assertNotNull(class1);
        assertNotNull(class1.getClassCode());
        assertEquals(grade,class1.getGrade());
    }

}
