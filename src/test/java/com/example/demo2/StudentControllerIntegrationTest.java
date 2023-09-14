package com.example.demo2;

import com.example.demo2.entity.Student;
import com.example.demo2.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private StudentService studentService;

    // Create (Add) Student
    @Test
    public void testAddStudent() {
        String name = "John";
        String contact = "john@example.com";

        Student student = new Student();
        student.setName(name);
        student.setContact(contact);

        ResponseEntity<Student> response = restTemplate.postForEntity("/student/add", student, Student.class);

        assertEquals(201, response.getStatusCodeValue()); // HTTP 201 Created
        assertNotNull(response.getBody().getStudentID());
        assertEquals(name, response.getBody().getName());
        assertEquals(contact, response.getBody().getContact());
    }

    // Read (Get) Student by ID
    @Test
    public void testGetStudentById() {
        // Assuming a student with ID 1 exists in the database
        int studentId = 1;

        ResponseEntity<Student> response = restTemplate.getForEntity("/student/get/" + studentId, Student.class);

        assertEquals(200, response.getStatusCodeValue()); // HTTP 200 OK
        assertNotNull(response.getBody());
    }

    // Update Student
    @Test
    public void testUpdateStudent() {
        // Assuming a student with ID 2 exists in the database
        int studentId = 2;
        String updatedName = "Updated Alice";
        String updatedContact = "updated.alice@example.com";

        Student updatedStudent = new Student();
        updatedStudent.setName(updatedName);
        updatedStudent.setContact(updatedContact);

        restTemplate.put("/student/update/" + studentId, updatedStudent);

        Student updatedStudentFromDb = studentService.findStudentById(studentId);

        assertNotNull(updatedStudentFromDb);
        assertEquals(updatedName, updatedStudentFromDb.getName());
        assertEquals(updatedContact, updatedStudentFromDb.getContact());
    }

    // Delete Student
    @Test
    public void testDeleteStudent() {
        // Assuming a student with ID 3 exists in the database
        int studentId = 3;

        restTemplate.delete("/student/delete/" + studentId);

        Student deletedStudent = studentService.findStudentById(studentId);

        assertNull(deletedStudent); // Student should not exist in the database after deletion
    }
}
