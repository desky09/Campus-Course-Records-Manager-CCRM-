package main.dao;

import main.model.*;
import java.util.*;

public class DataManager {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();

    // Student operations
    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        return students.stream().filter(s -> s.getId().equals(String.valueOf(id))).findFirst().orElse(null);
    }

    // Course operations
    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourseById(int id) {
        return courses.stream().filter(c -> c.getCourseId() == id).findFirst().orElse(null);
    }

    // Enrollment operations
    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollments;
    }

    public List<Enrollment> getEnrollmentsByStudent(int studentId) {
        return enrollments.stream().filter(e -> e.getStudent().getId().equals(String.valueOf(studentId))).toList();
    }

    public List<Enrollment> getEnrollmentsByCourse(int courseId) {
        return enrollments.stream().filter(e -> e.getCourse().getCourseId() == courseId).toList();
    }
}
