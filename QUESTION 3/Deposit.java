// QUESTION 3 part 1

public class Deposit {
    private long principal;
    private int time;
    private double rate;
    private double totalAmt;

    // Constructor 1: Deposit()
    public Deposit() {
        this.principal = 0;
        this.time = 0;
        this.rate = 0.0;
    }

    // Constructor 2: Deposit(long, int, double)
    public Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    // Constructor 3: Deposit(long, int)
    public Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        this.rate = 0.0; // default rate
    }

    // Constructor 4: Deposit(long, double)
    public Deposit(long principal, double rate) {
        this.principal = principal;
        this.time = 0; // default time
        this.rate = rate;
    }

    // Method: display()
    public void display() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + totalAmt);
    }

    // Method: calcAmt()
    public void calcAmt() {
        totalAmt = principal + (principal * rate * time) / 100;
    }
}