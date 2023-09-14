package com.example.demo2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_ID")
    private int studentID;
    @Column(name = "Student_Name")
    private String name;
    @Column(name = "Student_Contact_number")
    private String contact;
    @Column(name = "Student_Address")
    private String address;
    @Column(name = "Student_email")
    private String email;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="Student_ID",referencedColumnName = "Student_ID")
    private List<StudentSubject> studentSubjects;



}

