package main.model;

public class Grade {
    private String gradeValue; // e.g., A, B, C, etc.
    private double numericValue; // e.g., 4.0, 3.0, etc.

    public Grade(String gradeValue, double numericValue) {
        this.gradeValue = gradeValue;
        this.numericValue = numericValue;
    }

    // Getters and Setters
    public String getGradeValue() { return gradeValue; }
    public void setGradeValue(String gradeValue) { this.gradeValue = gradeValue; }

    public double getNumericValue() { return numericValue; }
    public void setNumericValue(double numericValue) { this.numericValue = numericValue; }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeValue='" + gradeValue + '\'' +
                ", numericValue=" + numericValue +
                '}';
    }
}
