package com.max.student_system;

import java.util.Scanner;

public class StudentSystem {
    private Student[] students;
    private int numStudents;
    public StudentSystem() {
        students = new Student[10];
        students[0] = new Student("张三", "101", "1999-01-01", true, "13811111111");
        students[1] = new Student("李四", "102", "1999-01-02", false, "13811111112");
        students[2] = new Student("王五", "103", "1999-01-03", true, "13811111113");
        students[3] = new Student("赵六", "104", "1999-01-04", false, "13811111114");
        students[4] = new Student("田七", "105", "1999-01-05", true, "13811111115");
        numStudents = 5;
    }

    public Student getStudentByID(String id) {
        for (int i = 0; i < numStudents; i++) {
            if (id.equals(students[i].getStudentID())) {
                return students[i];
            }
        }
        return null;
    }

    private int findStudentIndexByID(String id) {
        for (int i = 0; i < numStudents; i++) {
            if (id.equals(students[i].getStudentID())) {
                return i;
            }
        }
        return -1;
    }

    public boolean addStudent(Student student) {
        if (numStudents == students.length) {
            int newLength = students.length * 2;
            reserve(newLength);
        }
        students[numStudents] = student;
        numStudents++;
        return true;
    }

    private void reserve(int newLength) {
        Student[] newStudents = new Student[newLength];
        System.arraycopy(students, 0, newStudents, 0, numStudents);
        students = newStudents;
    }

    public boolean modifyStudentByID(String id) {
        Student stu = getStudentByID(id);
        if (stu == null) {
            return false;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        stu.setName(name);
        System.out.print("Enter your birthday: ");
        String birthday = sc.next();
        stu.setBirthDate(birthday);
        System.out.print("Enter your gender: ");
        String gender = sc.next();
        stu.setGender("男".equals(gender) ? true : false);
        System.out.print("Enter your telephone: ");
        String telephone = sc.next();
        stu.setTelephone(telephone);
        return true;
    }

    public boolean removeStudentByID(String id) {
        int index = findStudentIndexByID(id);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < numStudents - 1; i++) {
            students[i] = students[i + 1];
        }
        numStudents--;
        return true;
    }

    public void printStudents() {
        for (int i = 0; i < numStudents; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }
}
