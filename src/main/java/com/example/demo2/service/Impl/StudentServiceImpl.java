package com.example.demo2.service.Impl;

import com.example.demo2.entity.Student;
import com.example.demo2.repository.StudentRepo;
import com.example.demo2.service.StudentService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.rmi.StubNotFoundException;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    //Adding new Student

    @Override
    public Student addStudent(Student student){
        return studentRepo.save(student);
    }

    //To get all the Students
    @Override
    public List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    @Transactional // Add the @Transactional annotation to handle transactions
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepo.findStudentByStudentID(id);
    }

    @Override
    public Student addStudentName(String name) {
        Student student=new Student();
        student.setName(name);
        return studentRepo.save(student);
    }

    @Override
    public Student addStudentContcat(String contact) {
        Student student=new Student();
        student.setContact(contact);
        return studentRepo.save(student);
    }


}
