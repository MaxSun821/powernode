package com.max.student_system;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StudentSystem st = new StudentSystem();
        Scanner sc = new Scanner(System.in);
//        st.printStudents();
        while (true) {
            System.out.println("Welcome to the Student System");
            menu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    st.printStudents();
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String id = sc.next();
                    Student stu = st.getStudentByID(id);
                    if (stu != null) {
                        System.out.println(stu);
                    }
                    break;
                case 3:
                    System.out.print("Enter your name: ");
                    String name = sc.next();
                    System.out.print("Enter your id: ");
                    String stuID = sc.next();
                    System.out.print("Enter your birthday: ");
                    String birthday = sc.next();
                    System.out.print("Enter your gender: ");
                    String gender = sc.next();
                    System.out.print("Enter your telephone: ");
                    String telephone = sc.next();
                    Student s1 = new Student(name, stuID, birthday, "男".equals(gender) ? true : false, telephone);
                    st.addStudent(s1);
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    id = sc.next();
                    st.modifyStudentByID(id);
                    break;
                case 5:
                    System.out.print("Enter student ID: ");
                    id = sc.next();
                    st.removeStudentByID(id);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("[1]Show all students");
        System.out.println("[2]Find student by ID");
        System.out.println("[3]Addition a student");
        System.out.println("[4]modify student by ID");
        System.out.println("[5]delete student by ID");
        System.out.println("[0]Exit");
    }
}
