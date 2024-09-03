// package Question 5; part 2

public class CSE extends Marks {
    private int algoDesign;

    // Constructor: CSE(int, int, int)
    public CSE(int markICP, int markDSA, int algoDesign) {
        super(markICP, markDSA);
        this.algoDesign = algoDesign;
    }

    // Override method: getPercentage()
    @Override
    public double getPercentage() {
        return (markICP + markDSA + algoDesign) / 3.0;
    }
}