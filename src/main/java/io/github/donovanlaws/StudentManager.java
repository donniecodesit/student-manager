package io.github.donovanlaws;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.UUID;

public class StudentManager {
    private final HashMap<UUID, Student> students;
    public StudentManager() {
        this.students = new HashMap<>();
    }

    public Student getStudent(UUID id) {
        return students.get(id);
    }

    public HashMap<UUID, Student> getStudentList() {
        if (students.isEmpty()) throw new NoSuchElementException("There are no students.");
        return students;
    }

    public void addStudent(Student student) {
        students.put(UUID.randomUUID(), student);
    }

    public void removeStudent(UUID id) {
        students.remove(id);
    }

    public void updateStudent(UUID id, Student student) {
        students.put(id, student);
    }
}
