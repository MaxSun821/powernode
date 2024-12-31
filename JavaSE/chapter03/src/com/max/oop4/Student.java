package com.max.oop4;

public class Student {
    private String name;
    private String studentID;
    private Course course;

    public Student() {
    }

    public Student(String name, String studentID, Course course) {
        this.name = name;
        this.studentID = studentID;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Course getCourse() {
        return course;
    }

    public boolean optOut() {
        if (course == null) {
            return false;
        }
        course = null;
        return true;
    }

    public boolean pickCourse(Course course) {
        if (this.course != null) {
            return false;
        }
        this.course = course;
        return true;
    }

    public void display() {
        System.out.println("Name: " + getName() + ", StudentID: " + getStudentID() + ", Course: " + getCourse());
    }
}
