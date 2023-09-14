package com.example.demo2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Subject_Code")
    private int subjectCode;
    @Column(name = "Subject_Name")
    private String subjectName;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="Teaching_Subject_Code",referencedColumnName = "Subject_Code")
    private List<Teacher> teacher;


}
