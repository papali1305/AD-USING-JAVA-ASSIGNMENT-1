// part 1


package edu.student;

public class Student {
    protected String name;
    protected int roll;

    // Method: inputDetails()
    public void inputDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Method: showDetails()
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}