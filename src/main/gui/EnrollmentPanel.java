package main.gui;

import main.service.EnrollmentService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnrollmentPanel extends JPanel {
    private EnrollmentService enrollmentService;
    private JTextField studentIdField, courseIdField, semesterField;
    private JButton enrollButton;
    private JLabel messageLabel;

    public EnrollmentPanel(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
        initializeComponents();
        layoutComponents();
    }

    private void initializeComponents() {
        studentIdField = new JTextField(20);
        courseIdField = new JTextField(20);
        semesterField = new JTextField(20);
        enrollButton = new JButton("Enroll Student");
        messageLabel = new JLabel("");

        enrollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enrollStudent();
            }
        });

        // Eye-catching UI
        setBackground(new Color(240, 255, 240)); // Honeydew
        enrollButton.setBackground(new Color(0, 128, 0)); // Green
        enrollButton.setForeground(Color.WHITE);
        enrollButton.setFont(new Font("Arial", Font.BOLD, 12));
        messageLabel.setFont(new Font("Arial", Font.ITALIC, 12));
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Student ID:"), gbc);
        gbc.gridx = 1;
        add(studentIdField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Course ID:"), gbc);
        gbc.gridx = 1;
        add(courseIdField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Semester:"), gbc);
        gbc.gridx = 1;
        add(semesterField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        add(enrollButton, gbc);

        gbc.gridy = 4;
        add(messageLabel, gbc);
    }

    private void enrollStudent() {
        String studentIdText = studentIdField.getText().trim();
        String courseIdText = courseIdField.getText().trim();
        String semester = semesterField.getText().trim();

        try {
            int studentId = Integer.parseInt(studentIdText);
            int courseId = Integer.parseInt(courseIdText);
            enrollmentService.enrollStudent(studentId, courseId, semester);
            messageLabel.setText("Enrollment added successfully!");
            messageLabel.setForeground(Color.GREEN);
            clearFields();
        } catch (NumberFormatException e) {
            messageLabel.setText("Error: Student ID and Course ID must be numbers.");
            messageLabel.setForeground(Color.RED);
        } catch (IllegalArgumentException e) {
            messageLabel.setText("Error: " + e.getMessage());
            messageLabel.setForeground(Color.RED);
        }
    }

    private void clearFields() {
        studentIdField.setText("");
        courseIdField.setText("");
        semesterField.setText("");
    }
}
