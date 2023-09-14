package com.example.demo2.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Class implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Class_Code")
    private int classCode;
    @Column(name = "Class_Grade")
    private String grade;
    @Column(name = "Class_Name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="Assigned_Class_code",referencedColumnName = "Class_Code")
    private List<Student> student;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="Assigned_Class_Code",referencedColumnName = "Class_Code")
    private List<Teacher> teacher;

}
