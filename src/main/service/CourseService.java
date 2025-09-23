package main.service;

import main.dao.DataManager;
import main.model.Course;
import java.util.List;

public class CourseService {
    private DataManager dataManager;

    public CourseService(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void addCourse(String courseName, String courseCode, int credits) {
        int id = dataManager.getAllCourses().size() + 1;
        Course course = new Course(id, courseCode, courseName, credits, 30); // Default capacity
        dataManager.addCourse(course);
    }

    public List<Course> getAllCourses() {
        return dataManager.getAllCourses();
    }

    public Course getCourseById(int id) {
        return dataManager.getCourseById(id);
    }
}
