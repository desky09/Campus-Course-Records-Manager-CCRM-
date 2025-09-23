package main.model;

public class Course {
    private int courseId;
    private String code;
    private String title;
    private int credits;
    private int capacity;

    public Course(int courseId, String code, String title, int credits, int capacity) {
        this.courseId = courseId;
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.capacity = capacity;
    }

    public int getCourseId() { return courseId; }
    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    public int getCapacity() { return capacity; }
}
