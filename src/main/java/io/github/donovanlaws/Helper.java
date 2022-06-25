package io.github.donovanlaws;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Helper {
    Scanner scanner;
    StudentManager manager;
    public Helper(Scanner scanner, StudentManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void getStudent() {
        System.out.print("Enter Student UUID: ");
        Student student = manager.getStudent(UUID.fromString(scanner.next()));
        System.out.println("Name: " + student.getStudentFirstName() + " " + student.getStudentLastName() + ", Age: " + student.getStudentAge() + ", Grade: " + student.getStudentGrade() + ", GPA: " + student.getStudentGPA());
        System.out.println("---------------");
    }

    public void addStudent() {
        System.out.print("Enter Student First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter Student Last Name: ");
        String lastName = scanner.next();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Student Grade: ");
        int grade = scanner.nextInt();
        System.out.print("Enter Student GPA: ");
        float gpa = scanner.nextFloat();
        manager.addStudent(new Student(age, grade, gpa, firstName, lastName));
        System.out.println("---------------");
    }

    public void removeStudent() {
        System.out.print("Enter Student UUID: ");
        manager.removeStudent(UUID.fromString(scanner.next()));
        System.out.println("---------------");
    }

    public void updateStudent() {
        System.out.print("Enter Student UUID: ");
        UUID id = UUID.fromString(scanner.next());
        Student student = manager.getStudent(id);
        System.out.print("Enter Student First Name: ");
        student.setStudentFirstName(scanner.next());
        System.out.print("Enter Student Last Name: ");
        student.setStudentLastName(scanner.next());
        System.out.print("Enter Student Age: ");
        student.setStudentAge(scanner.nextInt());
        System.out.print("Enter Student Grade: ");
        student.setStudentGrade(scanner.nextInt());
        System.out.print("Enter Student GPA: ");
        student.setStudentGPA(scanner.nextFloat());
        manager.updateStudent(id, student);
        System.out.println("---------------");
    }

    public void listStudents() {
        HashMap<UUID, Student> students = manager.getStudentList();
        for (Map.Entry<UUID, Student> student : students.entrySet()) {
            System.out.println("UUID: " + student.getKey().toString());
            System.out.println("Name: " + student.getValue().getStudentFirstName() + " " + student.getValue().getStudentLastName() + ", Age: " + student.getValue().getStudentAge() + ", Grade: " + student.getValue().getStudentGrade() + ", GPA: " + student.getValue().getStudentGPA());
            System.out.println("---------------");
        }
    }
}
