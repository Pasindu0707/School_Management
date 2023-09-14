package com.example.demo2;

import com.example.demo2.entity.Subject;
import com.example.demo2.service.SubjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class SubjectTest {

    @Autowired
    private SubjectService subjectService;

    @Test
    public void testAddSubjectName(){
        String subName="English";

        Subject subject=subjectService.addSubjectName(subName);

        assertNotNull(subject);
        assertNotNull(subject.getSubjectCode());
        assertEquals(subName,subject.getSubjectName());
    }

}
