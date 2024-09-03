// Question 3 part 2  

// File name: DepositTest.java

public class DepositTest {
    public static void main(String[] args) {
        // Create an instance of Deposit using Constructor 2
        Deposit deposit = new Deposit(10000, 2, 5.0);

        // Calculate the total amount
        deposit.calcAmt();

        // Display the instance variables
        deposit.display();

        System.out.println();

        // Create an instance of Deposit using Constructor 3
        Deposit deposit2 = new Deposit(20000, 3);

        // Calculate the total amount
        deposit2.calcAmt();

        // Display the instance variables
        deposit2.display();

        System.out.println();

        // Create an instance of Deposit using Constructor 4
        Deposit deposit3 = new Deposit(30000, 4.5);

        // Calculate the total amount
        deposit3.calcAmt();

        // Display the instance variables
        deposit3.display();
    }
}