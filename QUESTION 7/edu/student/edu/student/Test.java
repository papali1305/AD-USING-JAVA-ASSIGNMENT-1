// package QUESTION 7.edu.student.edu.student;
// part 2 


package edu.student;

public class Test extends Student {
    private int mark1;
    private int mark2;

    // Method: inputDetails()
    public void inputDetails(String name, int roll, int mark1, int mark2) {
        super.inputDetails(name, roll);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    // Method: showDetails()
    public void showDetails() {
        super.showDetails();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}
