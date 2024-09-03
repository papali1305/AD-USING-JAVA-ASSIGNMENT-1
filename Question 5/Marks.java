//package Question 5; part 1

// File name: Marks.java

public abstract class Marks {
    protected int markICP;
    protected int markDSA;
    protected double percentage;

    // Constructor: Marks(int, int)
    public Marks(int markICP, int markDSA) {
        this.markICP = markICP;
        this.markDSA = markDSA;
    }

    // Abstract method: getPercentage()
    public abstract double getPercentage();
}