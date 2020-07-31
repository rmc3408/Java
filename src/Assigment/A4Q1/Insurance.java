package Assigment.A4Q1;

public abstract class Insurance {

    String typeIns;
    double monCost;

    public Insurance(String name, double val) {
        this.typeIns = name;
        this.monCost = val;
    }

    public String getTypeIns() {
        return typeIns;
    }

    public double getMonthlyCost() {
        return monCost;
    }

    abstract void setInsuranceCost(double v);

    abstract String displayInfo();

}