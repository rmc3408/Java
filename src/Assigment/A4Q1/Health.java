package Assigment.A4Q1;

public class Health extends Insurance {


    public Health(String name, double val) {
        super(name, val);
        System.out.printf("-- Health Object Created --%n");
    }

    @Override
    public void setInsuranceCost(double val) {
        super.monCost = val;
    }

    @Override
    public String displayInfo() {
        return getTypeIns() + " insurance cost $" + getMonthlyCost();
    }
}