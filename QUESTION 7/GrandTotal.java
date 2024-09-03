//package QUESTION 7;
// part 5

public class GrandTotal {
    public static void main(String[] args) {
        // Create an instance of Test
        Test test = new Test();
        test.inputDetails("John Doe", 1, 80, 90);
        test.inputScore(70, 80);

        // Calculate and display grand total mark and score
        int grandTotalMark = test.mark1 + test.mark2;
        int grandTotalScore = Sports.score1 + Sports.score2;
        System.out.println("Grand Total Mark: " + grandTotalMark);
        System.out.println("Grand Total Score: " + grandTotalScore);
    }
}
