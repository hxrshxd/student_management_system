package com.example.student_management_system;

public class Student {
    private String name;
    private int rollNo;
    private int contact;

    public Student(String name, int rollNo, int contact) {
        this.name = name;
        this.rollNo = rollNo;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
