//package QUESTION 7.edu.student.edu.student.edu.sports.edu.student;
// part 4 

package edu.student;

import edu.sports.Sports;

public class Test extends Student implements Sports {
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

    // Implementation of Sports interface method: inputScore()
    @Override
    public void inputScore(int score1, int score2) {
        Sports.score1 = score1;
        Sports.score2 = score2;
    }

    // Implementation of Sports interface method: showScore()
    @Override
    public void showScore() {
        System.out.println("Score 1: " + Sports.score1);
        System.out.println("Score 2: " + Sports.score2);
    }
}
