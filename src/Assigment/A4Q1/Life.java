package Assigment.A4Q1;

public class Life extends Insurance {

    public Life(String name, double val) {

        super(name, val);
        System.out.printf("-- Life Object Created --%n");
    }

    @Override
    public void setInsuranceCost(double val) {
        super.monCost = val;
    }

    @Override
    public String displayInfo() {
        return "Life insurance: " + getTypeIns() + " - cost: $" + getMonthlyCost();
    }
}