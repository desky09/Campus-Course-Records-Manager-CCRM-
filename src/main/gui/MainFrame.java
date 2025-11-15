package main.gui;

import main.dao.DataManager;
import main.service.StudentService;
import main.service.CourseService;
import main.service.EnrollmentService;
import main.service.ReportService;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private DataManager dataManager;
    private StudentService studentService;
    private CourseService courseService;
    private EnrollmentService enrollmentService;
    private ReportService reportService;

    public MainFrame() {
        this.dataManager = new DataManager();
        this.studentService = new StudentService(dataManager);
        this.courseService = new CourseService(dataManager);
        this.enrollmentService = new EnrollmentService(dataManager);
        this.reportService = new ReportService(dataManager);

        setTitle("Campus Course & Records Manager (CCRM)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        StudentPanel studentPanel = new StudentPanel(studentService);
        CoursePanel coursePanel = new CoursePanel(courseService);
        EnrollmentPanel enrollmentPanel = new EnrollmentPanel(enrollmentService);
        ReportsPanel reportsPanel = new ReportsPanel(reportService);

        tabbedPane.addTab("Students", studentPanel);
        tabbedPane.addTab("Courses", coursePanel);
        tabbedPane.addTab("Enrollments", enrollmentPanel);
        tabbedPane.addTab("Reports", reportsPanel);

        add(tabbedPane, BorderLayout.CENTER);

        // Eye-catching UI: Set a nice background color and font
        getContentPane().setBackground(new Color(240, 248, 255)); // Alice Blue
        tabbedPane.setFont(new Font("Arial", Font.BOLD, 14));
        tabbedPane.setBackground(new Color(70, 130, 180)); // Steel Blue
        tabbedPane.setForeground(Color.WHITE);
    }
}
