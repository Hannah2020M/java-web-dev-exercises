package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }
    public int getstudentId() {
        return studentId;
    }

    public void setstudentId(String aStudentId) {
        name = aStudentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(String aNumberOfCredits) {
        name = aNumberOfCredits;
    }
    public int getGPA() {
        return gpa;
    }

    public void setGPA(String aGPA) {
        name = aGPA;
    }
    Student IndianStudent = new Student();
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }
    public int getstudentId() {
        return studentId;
    }

    public void setstudentId(String aStudentId) {
        name = aStudentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public int getGPA() {
        return gpa;
    }

    public void setGPA(double aGPA) {
        gpa = 4.0;
    }

}