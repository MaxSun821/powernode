package com.max.student_system;

import java.util.Objects;

public class Student {
    private String name;
    private String studentID;
    private String birthDate;
    private boolean gender;
    private String telephone;

    public Student() {
    }

    public Student(String name, String studentID, String birthDate, boolean gender, String telephone) {
        this.name = name;
        this.studentID = studentID;
        this.birthDate = birthDate;
        this.gender = gender;
        this.telephone = telephone;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return gender == student.gender && Objects.equals(name, student.name) && Objects.equals(studentID, student.studentID) && Objects.equals(birthDate, student.birthDate) && Objects.equals(telephone, student.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentID, birthDate, gender, telephone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender=" + (gender ? "male" : "female") +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
