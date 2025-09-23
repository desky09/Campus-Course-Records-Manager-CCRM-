package main.service;

import main.dao.DataManager;
import main.model.Enrollment;
import java.util.List;
import java.util.stream.Collectors;

public class ReportService {
    private DataManager dataManager;

    public ReportService(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public String generateStudentReport(int studentId) {
        List<Enrollment> enrollments = dataManager.getEnrollmentsByStudent(studentId);
        StringBuilder report = new StringBuilder();
        report.append("Student Report for ID: ").append(studentId).append("\n");
        for (Enrollment e : enrollments) {
            report.append(e.toString()).append("\n");
        }
        return report.toString();
    }

    public String generateCourseReport(int courseId) {
        List<Enrollment> enrollments = dataManager.getEnrollmentsByCourse(courseId);
        StringBuilder report = new StringBuilder();
        report.append("Course Report for ID: ").append(courseId).append("\n");
        for (Enrollment e : enrollments) {
            report.append(e.toString()).append("\n");
        }
        return report.toString();
    }
}
