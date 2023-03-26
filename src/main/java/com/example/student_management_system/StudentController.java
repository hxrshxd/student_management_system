package com.example.student_management_system;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

// here i am defining / writing APIs
@RestController // this is used to show that we are writing API
public class StudentController {

    // temporary database
    HashMap<Integer, Student> hashMap = new HashMap<>();

    // store data in database
    @PostMapping("/registerStudent") // endpoint is registerStudent
    public void registerStudent(@RequestBody Student student) {
        int key = student.getRollNo();
        hashMap.put(key, student);
    }

    // to get data from database
    @GetMapping("/getStudentInfo")
    public Student getStudentInfo(@RequestParam("rollNo")Integer rollNo) {
        Student student = hashMap.get(rollNo);
        return student;
    }
}
