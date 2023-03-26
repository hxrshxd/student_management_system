package com.example.student_management_system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class StudentController {

    @PostMapping("/registerStudent")
    public void registerStudent(@RequestBody Student student) {

    }

    @GetMapping("/getTeacher")
    public void getTeacher(@RequestParam String teacher) {

    }
}
