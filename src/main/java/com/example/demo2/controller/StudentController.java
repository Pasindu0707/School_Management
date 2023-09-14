package com.example.demo2.controller;

import com.example.demo2.entity.Student;
import com.example.demo2.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //retrieve Student data
    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return studentService.findAllStudent();
    }

    //Adding Student data
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    //updating
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        Student student = studentService.findStudentById(id);
        student.setName(updatedStudent.getName());
        student.setContact(updatedStudent.getContact());
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        Student student = studentService.findStudentById(id);
        if (student != null) {
            studentService.deleteStudent(id);
            return ResponseEntity.ok("Student with ID " + id + " has been deleted.");
        } else {
            return ResponseEntity.notFound().build(); // Return a 404 response if the student is not found
        }
    }

    @GetMapping("/get/{id}")
    public Student findUserByID(@PathVariable int id) {
        Student student = studentService.findStudentById(id);
        return studentService.findStudentById(id);

    }
}
