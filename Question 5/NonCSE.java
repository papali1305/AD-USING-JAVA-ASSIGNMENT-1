//package Question 5; part 3 


public class NonCSE extends Marks {
    private int enggMechanics;

    // Constructor: NonCSE(int, int, int)
    public NonCSE(int markICP, int markDSA, int enggMechanics) {
        super(markICP, markDSA);
        this.enggMechanics = enggMechanics;
    }

    // Override method: getPercentage()
    @Override
    public double getPercentage() {
        return (markICP + markDSA + enggMechanics) / 3.0;
    }
}