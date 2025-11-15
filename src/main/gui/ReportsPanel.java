package main.gui;

import main.service.ReportService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReportsPanel extends JPanel {
    private ReportService reportService;
    private JTextField studentIdField, courseIdField;
    private JButton studentReportButton, courseReportButton;
    private JTextArea reportArea;

    public ReportsPanel(ReportService reportService) {
        this.reportService = reportService;
        initializeComponents();
        layoutComponents();
    }

    private void initializeComponents() {
        studentIdField = new JTextField(10);
        courseIdField = new JTextField(10);
        studentReportButton = new JButton("Generate Student Report");
        courseReportButton = new JButton("Generate Course Report");
        reportArea = new JTextArea(15, 50);
        reportArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(reportArea);

        studentReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateStudentReport();
            }
        });

        courseReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateCourseReport();
            }
        });

        // Eye-catching UI
        setBackground(new Color(255, 248, 220)); // Cornsilk
        studentReportButton.setBackground(new Color(25, 25, 112)); // Midnight Blue
        studentReportButton.setForeground(Color.WHITE);
        courseReportButton.setBackground(new Color(25, 25, 112));
        courseReportButton.setForeground(Color.WHITE);
        studentReportButton.setFont(new Font("Arial", Font.BOLD, 12));
        courseReportButton.setFont(new Font("Arial", Font.BOLD, 12));
        reportArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        reportArea.setBackground(new Color(245, 245, 245));
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0; gbc.gridy = 0;
        inputPanel.add(new JLabel("Student ID:"), gbc);
        gbc.gridx = 1;
        inputPanel.add(studentIdField, gbc);
        gbc.gridx = 2;
        inputPanel.add(studentReportButton, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        inputPanel.add(new JLabel("Course ID:"), gbc);
        gbc.gridx = 1;
        inputPanel.add(courseIdField, gbc);
        gbc.gridx = 2;
        inputPanel.add(courseReportButton, gbc);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(reportArea), BorderLayout.CENTER);
    }

    private void generateStudentReport() {
        String studentIdText = studentIdField.getText().trim();
        try {
            int studentId = Integer.parseInt(studentIdText);
            String report = reportService.generateStudentReport(studentId);
            reportArea.setText(report);
        } catch (NumberFormatException e) {
            reportArea.setText("Error: Student ID must be a number.");
        } catch (IllegalArgumentException e) {
            reportArea.setText("Error: " + e.getMessage());
        }
    }

    private void generateCourseReport() {
        String courseIdText = courseIdField.getText().trim();
        try {
            int courseId = Integer.parseInt(courseIdText);
            String report = reportService.generateCourseReport(courseId);
            reportArea.setText(report);
        } catch (NumberFormatException e) {
            reportArea.setText("Error: Course ID must be a number.");
        } catch (IllegalArgumentException e) {
            reportArea.setText("Error: " + e.getMessage());
        }
    }
}
