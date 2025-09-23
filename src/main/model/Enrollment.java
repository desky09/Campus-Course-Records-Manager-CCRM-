package main.model;

public class Enrollment {
    private int enrollmentId;
    private Student student;
    private Course course;
    private String semester;
    private Grade grade;

    public Enrollment(int enrollmentId, Student student, Course course, String semester) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    // Getters and Setters
    public int getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(int enrollmentId) { this.enrollmentId = enrollmentId; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }

    public Grade getGrade() { return grade; }
    public void setGrade(Grade grade) { this.grade = grade; }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", student=" + student.getName() +
                ", course=" + course.getTitle() +
                ", semester='" + semester + '\'' +
                ", grade=" + (grade != null ? grade.getGradeValue() : "N/A") +
                '}';
    }
}
