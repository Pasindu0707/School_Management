package com.example.demo2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class StudentSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_Subject_ID")
    private int subjectID;
    @Column(name = "Student_Subject_Name")
    private String stSubjectName;
    @Column(name = "Student_Subject_Code")
    private int stSubjectCode;




}
