package main.gui;

import main.service.CourseService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoursePanel extends JPanel {
    private CourseService courseService;
    private JTextField nameField, codeField, creditsField;
    private JButton addButton;
    private JLabel messageLabel;

    public CoursePanel(CourseService courseService) {
        this.courseService = courseService;
        initializeComponents();
        layoutComponents();
    }

    private void initializeComponents() {
        nameField = new JTextField(20);
        codeField = new JTextField(20);
        creditsField = new JTextField(20);
        addButton = new JButton("Add Course");
        messageLabel = new JLabel("");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });

        // Eye-catching UI
        setBackground(new Color(255, 228, 225)); // Misty Rose
        addButton.setBackground(new Color(255, 69, 0)); // Red Orange
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("Arial", Font.BOLD, 12));
        messageLabel.setFont(new Font("Arial", Font.ITALIC, 12));
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Code:"), gbc);
        gbc.gridx = 1;
        add(codeField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Credits:"), gbc);
        gbc.gridx = 1;
        add(creditsField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        add(addButton, gbc);

        gbc.gridy = 4;
        add(messageLabel, gbc);
    }

    private void addCourse() {
        String name = nameField.getText().trim();
        String code = codeField.getText().trim();
        String creditsText = creditsField.getText().trim();

        try {
            int credits = Integer.parseInt(creditsText);
            courseService.addCourse(name, code, credits);
            messageLabel.setText("Course added successfully!");
            messageLabel.setForeground(Color.GREEN);
            clearFields();
        } catch (NumberFormatException e) {
            messageLabel.setText("Error: Credits must be a number.");
            messageLabel.setForeground(Color.RED);
        } catch (IllegalArgumentException e) {
            messageLabel.setText("Error: " + e.getMessage());
            messageLabel.setForeground(Color.RED);
        }
    }

    private void clearFields() {
        nameField.setText("");
        codeField.setText("");
        codeField.setText("");
        creditsField.setText("");
    }
}
