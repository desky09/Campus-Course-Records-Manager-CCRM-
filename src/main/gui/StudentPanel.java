package main.gui;

import main.service.StudentService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentPanel extends JPanel {
    private StudentService studentService;
    private JTextField nameField, emailField, phoneField;
    private JButton addButton;
    private JLabel messageLabel;

    public StudentPanel(StudentService studentService) {
        this.studentService = studentService;
        initializeComponents();
        layoutComponents();
    }

    private void initializeComponents() {
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);
        addButton = new JButton("Add Student");
        messageLabel = new JLabel("");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        // Eye-catching UI
        setBackground(new Color(255, 250, 205)); // Lemon Chiffon
        addButton.setBackground(new Color(34, 139, 34)); // Forest Green
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
        add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Phone:"), gbc);
        gbc.gridx = 1;
        add(phoneField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        add(addButton, gbc);

        gbc.gridy = 4;
        add(messageLabel, gbc);
    }

    private void addStudent() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String phone = phoneField.getText().trim();

        try {
            studentService.addStudent(name, email, phone);
            messageLabel.setText("Student added successfully!");
            messageLabel.setForeground(Color.GREEN);
            clearFields();
        } catch (IllegalArgumentException e) {
            messageLabel.setText("Error: " + e.getMessage());
            messageLabel.setForeground(Color.RED);
        }
    }

    private void clearFields() {
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
    }
}
