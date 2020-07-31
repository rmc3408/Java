package Assigment.A4Q1;

public class Health extends Insurance {


    public Health(String name, double val) {
        super(name, val);
        System.out.printf("-- Health Object Created --%n%n%n");
    }

    @Override
    public void setInsuranceCost(double val) {
        super.monCost = super.monCost + val + 1;
    }

    @Override
    public String displayInfo() {
        return getTypeIns() + " insurance cost $" + getMonthlyCost();
    }
}