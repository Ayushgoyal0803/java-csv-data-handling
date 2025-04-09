package com.bridgelabz.advanceProblems;

import com.opencsv.bean.CsvBindByName;

public class Student {
    @CsvBindByName
    String name;

    @CsvBindByName
    int rollNo;

    @CsvBindByName
    String course;

    public Student() {
        // No-arg constructor is required and must be public
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse(){
        return course;
    }

    public int getRollNo(){
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "', course=" + course + "}";
    }
}
