package main.util;

import main.dao.DataManager;
import main.service.StudentService;
import main.service.CourseService;
import main.service.EnrollmentService;
import main.service.ReportService;
import java.util.Scanner;

public class ConsoleManager {
    private DataManager dataManager;
    private StudentService studentService;
    private CourseService courseService;
    private EnrollmentService enrollmentService;
    private ReportService reportService;

    public ConsoleManager() {
        this.dataManager = new DataManager();
        this.studentService = new StudentService(dataManager);
        this.courseService = new CourseService(dataManager);
        this.enrollmentService = new EnrollmentService(dataManager);
        this.reportService = new ReportService(dataManager);
    }

    public void manageStudents(Scanner scanner) {
        System.out.println("\n--- Manage Students ---");
        System.out.println("1. Add Student");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student email: ");
            String email = scanner.nextLine();
            System.out.print("Enter student phone: ");
            String phone = scanner.nextLine();

            try {
                studentService.addStudent(name, email, phone);
                System.out.println("Student added successfully.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void manageCourses(Scanner scanner) {
        System.out.println("\n--- Manage Courses ---");
        System.out.println("1. Add Course");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter course name: ");
            String name = scanner.nextLine();
            System.out.print("Enter course code: ");
            String code = scanner.nextLine();
            System.out.print("Enter credits: ");
            int credits = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                courseService.addCourse(name, code, credits);
                System.out.println("Course added successfully.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void manageEnrollments(Scanner scanner) {
        System.out.println("\n--- Manage Enrollments ---");
        System.out.println("1. Enroll Student");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter course ID: ");
            int courseId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter semester: ");
            String semester = scanner.nextLine();

            try {
                enrollmentService.enrollStudent(studentId, courseId, semester);
                System.out.println("Enrollment added successfully.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void generateReports(Scanner scanner) {
        System.out.println("\n--- Generate Reports ---");
        System.out.println("1. Student Report");
        System.out.println("2. Course Report");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String report = reportService.generateStudentReport(studentId);
            System.out.println("\n" + report);
        } else if (choice == 2) {
            System.out.print("Enter course ID: ");
            int courseId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String report = reportService.generateCourseReport(courseId);
            System.out.println("\n" + report);
        }
    }
}
