# Campus Course & Records Manager (CCRM)

<<<<<<< HEAD
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
=======
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
>>>>>>> a34565bbf779132fc98ee15b0a8ecadedf4d72b0

## Java 21 (LTS) Requirement

- **This project now targets Java 21 (LTS).** You must have JDK 21 installed to compile and run the project with the supplied scripts.

Installation hints (Windows PowerShell):

```powershell
# Install Temurin 21 via winget (if you have winget):
winget install -e --id EclipseAdoptium.Temurin.21.JDK

# Or set JAVA_HOME to your JDK 21 installation and add to PATH:
$env:JAVA_HOME = 'C:\Program Files\Java\jdk-21'
$env:Path = $env:JAVA_HOME + '\bin;' + $env:Path

# Verify:
java -version
javac -version
```

Build & run (using provided scripts):

```powershell
# Windows (PowerShell):
.\scripts\compile.bat
.\scripts\run.bat

# Unix/macOS:
./scripts/compile.sh
./scripts/run.sh
```

If you prefer a build tool (Maven/Gradle), add a `pom.xml` or `build.gradle` and set the Java toolchain to 21.
