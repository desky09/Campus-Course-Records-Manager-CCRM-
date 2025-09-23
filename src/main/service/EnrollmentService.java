package main.service;

import main.dao.DataManager;
import main.model.*;

public class EnrollmentService {
    private DataManager dataManager;

    public EnrollmentService(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void enrollStudent(int studentId, int courseId, String semester) {
        Student student = dataManager.getStudentById(studentId);
        Course course = dataManager.getCourseById(courseId);
        if (student == null || course == null) {
            throw new IllegalArgumentException("Invalid student or course ID");
        }
        int enrollmentId = dataManager.getAllEnrollments().size() + 1;
        Enrollment enrollment = new Enrollment(enrollmentId, student, course, semester);
        dataManager.addEnrollment(enrollment);
    }

    public void assignGrade(int enrollmentId, String gradeValue, double numericValue) {
        Enrollment enrollment = dataManager.getAllEnrollments().stream()
                .filter(e -> e.getEnrollmentId() == enrollmentId)
                .findFirst().orElse(null);
        if (enrollment != null) {
            Grade grade = new Grade(gradeValue, numericValue);
            enrollment.setGrade(grade);
        }
    }
}
