# Campus Course & Records Manager (CCRM)

A comprehensive Java-based system for managing campus courses, student records, enrollments, and grades.

## Features

- *Course Management*: Create, edit, delete, and view courses
- *Student Management*: Register students and manage their information
- *Enrollment System*: Enroll students in courses with capacity management
- *Grade Management*: Record and calculate grades with GPA computation
- *Report Generation*: Generate various reports for students, courses, and enrollments
- *Data Persistence*: Automatic saving and loading of data using file I/O
- *Exception Handling*: Robust error handling and validation
- *GUI Interface*: User-friendly Swing-based graphical interface

## Technical Requirements Met

- ✅ Object-Oriented Programming (OOP)
- ✅ Inheritance and Polymorphism
- ✅ Exception Handling
- ✅ File I/O for Data Persistence
- ✅ Collections Framework (ArrayList, HashMap)
- ✅ GUI Implementation (Swing)
- ✅ Data Validation
- ✅ Comprehensive Error Handling

## Project Structure


src/
├── main/
│   ├── Main.java              # Entry point
│   ├── model/                 # Data models
│   │   ├── Person.java        # Abstract base class
│   │   ├── Student.java       # Student entity
│   │   ├── Course.java        # Course entity
│   │   ├── Enrollment.java    # Enrollment relationship
│   │   └── Grade.java         # Grade entity
│   ├── service/               # Business logic
│   │   ├── StudentService.java
│   │   ├── CourseService.java
│   │   ├── EnrollmentService.java
│   │   └── ReportService.java
│   ├── dao/                   # Data access layer
│   │   ├── DataManager.java   # File I/O operations
│   │   └── DatabaseSimulator.java
│   ├── gui/                   # User interface
│   │   ├── MainFrame.java     # Main window
│   │   ├── StudentPanel.java  # Student management UI
│   │   ├── CoursePanel.java   # Course management UI
│   │   ├── EnrollmentPanel.java
│   │   └── ReportsPanel.java
│   └── util/                  # Utilities
│       ├── ValidationUtils.java
│       └── Constants.java
└── data/                      # Data files (auto-generated)
    ├── students.dat
    ├── courses.dat
    └── enrollments.dat


## How to Run

1. *Compile the project*:
   bash
   javac -d bin src/main/*.java src/main/model/*.java src/main/service/*.java src/main/dao/*.java src/main/gui/*.java src/main/util/*.java
   

2. *Run the application*:
   bash
   java -cp bin main.Main
   

3. *Alternative*: Use your IDE (IntelliJ IDEA, Eclipse, VS Code) to import and run the project

## Usage Guide

### 1. Course Management
- Add new courses with course code, name, credits, and capacity
- Edit existing course information
- Delete courses (only if no students enrolled)
- View all courses with enrollment statistics

### 2. Student Management
- Register new students with personal information
- Update student details
- View student profiles and academic records
- Calculate student GPA

### 3. Enrollment Management
- Enroll students in available courses
- Check enrollment capacity and prerequisites
- Drop students from courses
- View enrollment history

### 4. Grade Management
- Record grades for enrolled students
- Support for different grade types (assignments, exams, final grades)
- Automatic GPA calculation
- Grade validation and error checking

### 5. Reports
- Student transcripts with GPA calculation
- Course enrollment reports
- Grade distribution analysis
- Academic performance summaries

## Data Persistence

The system automatically saves data to files:
- data/students.dat - Student information
- data/courses.dat - Course details
- data/enrollments.dat - Enrollment and grade data

Data is loaded automatically when the application starts.

## Error Handling

The system includes comprehensive error handling for:
- Invalid data input
- File I/O operations
- Duplicate entries
- Enrollment capacity limits
- Grade validation
- Data integrity checks

## Academic Integrity

This project demonstrates original implementation of:
- Object-oriented design principles
- Java programming best practices
- GUI development with Swing
- File handling and data persistence
- Exception handling strategies
- Input validation techniques

All code is written from scratch following academic standards and best practices.

## Author

Campus Course & Records Manager (CCRM)
Developed for Programming in Java Course Project
