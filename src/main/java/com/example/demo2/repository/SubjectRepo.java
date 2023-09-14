package com.example.demo2.repository;

import com.example.demo2.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository <Subject,Integer> {

}
