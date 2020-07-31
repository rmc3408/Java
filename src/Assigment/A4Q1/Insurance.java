package Assigment.A4Q1;

public abstract class Insurance {
    
    String typeIns;
    double monCost;

    public String getTypeIns()
    {
        return typeIns;
    }
    public double getMonthlyCost()
    {
        return monCost;
    }
    abstract double setInsurance();
    abstract String displayInfo();

}