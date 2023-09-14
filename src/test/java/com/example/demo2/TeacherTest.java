package com.example.demo2;

import com.example.demo2.entity.Student;
import com.example.demo2.entity.Teacher;
import com.example.demo2.service.StudentService;
import com.example.demo2.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TeacherTest {

    @Autowired
    private TeacherService teacherService;

    // Test adding a name using the service method
    @Test
    public void setTeacherName(){
        String name="Sunil";

        // Add the name using the service method
        Teacher savedTeacher = teacherService.addTeacherName(name);

        // Verify that the student is saved correctly
        assertNotNull(savedTeacher);
        assertNotNull(savedTeacher);
        assertEquals(name, savedTeacher.getName());



    }

}
