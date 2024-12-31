package com.max.oop4;

public class StudentTest {
    public static void main(String[] args) {
        Course c1 = new Course("Python", "6.001", "Computer Science", "Meya Luice", "4");
        Course c2 = new Course("Data Structure", "6.002", "Computer Science", "David Scheler", "5");

        Student s1 = new Student("Mike Lee", "10012", c1);
        s1.display();

        s1.optOut();
        s1.display();

        s1.pickCourse(c2);
        s1.display();
    }
}
