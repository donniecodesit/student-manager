package io.github.donovanlaws;

import java.util.UUID;

public class Student {
    private int studentAge;
    private int studentGrade;
    private float studentGPA;
    private String studentFirstName;
    private String studentLastName;

    public Student(int age, int grade, float gpa, String firstName, String lastName) {
        this.studentAge = age;
        this.studentGrade = grade;
        this.studentGPA = gpa;
        this.studentFirstName = firstName;
        this.studentLastName = lastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public float getStudentGPA() {
        return studentGPA;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentAge(int age) {
        studentAge = age;
    }

    public void setStudentGrade(int grade) {
        studentGrade = grade;
    }

    public void setStudentGPA(float gpa) {
        studentGPA = gpa;
    }

    public void setStudentFirstName(String firstName) {
        studentFirstName = firstName;
    }

    public void setStudentLastName(String lastName) {
        studentLastName = lastName;
    }
}
