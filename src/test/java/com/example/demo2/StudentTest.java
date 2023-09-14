package com.example.demo2;

import com.example.demo2.entity.Student;
import com.example.demo2.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentService studentService;

    // Test adding a name using the service method
    @Test
    public void testAddStudentName() {
        String name = "Nimal";

        // Add the name using the service method
        Student savedStudent = studentService.addStudentName(name);

        // Verify that the student is saved correctly
        assertNotNull(savedStudent);
        assertNotNull(savedStudent.getStudentID());
        assertEquals(name, savedStudent.getName());
    }

    @Test
    public void testAddStudentContact(){
        String contact="Nimal@gmail.com";
        //Student student=new Student();
        //student.setContact(contact);

        Student svStudent=studentService.addStudentContcat(contact);

        assertNotNull(svStudent);
        assertNotNull(svStudent.getStudentID());
        assertEquals(contact, svStudent.getContact());

    }
}
