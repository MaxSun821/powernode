package com.max.oop4;

public class Course {
    private String courseName;
    private String courseCode;
    private String courseAcademy;
    private String courseTeacher;
    private String courseCredit;

    public Course() {
    }

    public Course(String courseName, String courseCode, String courseAcademy, String courseTeacher, String courseCredit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseAcademy = courseAcademy;
        this.courseTeacher = courseTeacher;
        this.courseCredit = courseCredit;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseAcademy() {
        return courseAcademy;
    }

    public void setCourseAcademy(String courseAcademy) {
        this.courseAcademy = courseAcademy;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", courseAcademy='" + courseAcademy + '\'' +
                ", courseTeacher='" + courseTeacher + '\'' +
                ", courseCredit='" + courseCredit + '\'' +
                '}';
    }
}
