// package Question 5; part 4

// File name: MarksTest.java

public class MarksTest {
    public static void main(String[] args) {
        // Create an object of CSE
        CSE cse = new CSE(80, 70, 90);

        // Print the percentage of CSE student
        System.out.println("CSE Student Percentage: " + cse.getPercentage());

        // Create an object of NonCSE
        NonCSE nonCse = new NonCSE(90, 80, 70);

        // Print the percentage of NonCSE student
        System.out.println("NonCSE Student Percentage: " + nonCse.getPercentage());
    }
}