package main;

import main.util.ConsoleManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleManager consoleManager = new ConsoleManager();

        System.out.println("Welcome to Campus Course & Records Manager (CCRM) - Console Version");
        System.out.println("Select an option:");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Manage Enrollments");
            System.out.println("4. Generate Reports");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    consoleManager.manageStudents(scanner);
                    break;
                case 2:
                    consoleManager.manageCourses(scanner);
                    break;
                case 3:
                    consoleManager.manageEnrollments(scanner);
                    break;
                case 4:
                    consoleManager.generateReports(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
