package main.service;

import main.dao.DataManager;
import main.model.Student;
import main.util.ValidationUtils;
import java.util.List;

public class StudentService {
    private DataManager dataManager;

    public StudentService(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void addStudent(String name, String email, String phone) {
        if (!ValidationUtils.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (!ValidationUtils.isValidPhone(phone)) {
            throw new IllegalArgumentException("Invalid phone format");
        }
        int id = dataManager.getAllStudents().size() + 1;
        Student student = new Student(String.valueOf(id), name, "Computer Science"); // Default major
        dataManager.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return dataManager.getAllStudents();
    }

    public Student getStudentById(int id) {
        return dataManager.getStudentById(id);
    }
}
