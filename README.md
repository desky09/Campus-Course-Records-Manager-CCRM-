# Campus Course & Records Manager (CCRM)

This is a Java-based application for managing campus courses, students, enrollments, and grades.

## Project Structure

- `src/main/java/main/`: Contains the main application code
  - `Main.java`: Entry point of the application
  - `model/`: Data models (Student, Course, Enrollment, Grade, Person)
  - `dao/`: Data access objects (DataManager)
  - `service/`: Business logic services (StudentService, CourseService, EnrollmentService, ReportService)
  - `gui/`: Graphical user interface components (MainFrame, StudentPanel, CoursePanel, EnrollmentPanel, ReportsPanel)
  - `util/`: Utility classes (ValidationUtils)

## How to Run

1. Compile the Java files:
   ```
   javac -d out src/main/java/main/*.java src/main/java/main/*/*.java
   ```

2. Run the application:
   ```
   java -cp out main.Main
   ```

## Features

- Add and manage students
- Add and manage courses
- Enroll students in courses
- Assign grades to enrollments
- Generate reports for students and courses

## Requirements

- Java 8 or higher
