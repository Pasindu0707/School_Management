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

public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Teacher_ID")
    private int teacherId;
    @Column(name = "Teacher_Name")
    private String name;
    @Column(name = "Teacher_Address")
    private String address;

    @Column(name = "Teacher_Contact")
    private String contact;


}