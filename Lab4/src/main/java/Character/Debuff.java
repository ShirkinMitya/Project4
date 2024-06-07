package Character;

public class Debuff {

    private double damageReduction;
    private double defendReduction;
    private int numberOfMotion;

    public Debuff(int numberOfMotion) {
        this.numberOfMotion = numberOfMotion;
        this.damageReduction = 0.50;  
        this.defendReduction = 0.25;
    }

    public void MinusNumberOfMotion() {
        numberOfMotion -= 1;
    }

    public double getDamageReduction() {
        return damageReduction;
    }

    public double getDefendReduction() {
        return defendReduction;
    }

    public int getNumberOfMotion() {
        return numberOfMotion;
    }

}
