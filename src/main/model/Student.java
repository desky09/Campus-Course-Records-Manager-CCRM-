package main.model;

public class Student extends Person {
    private String major;

    public Student(String id, String name, String major) {
        super(id, name);
        this.major = major;
    }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    @Override
    public String toString() {
        return id + " - " + name + " (" + major + ")";
    }
}
