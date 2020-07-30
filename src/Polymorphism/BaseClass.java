package Polymorphism;

// Fig. 9.11: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class inherits from CommissionEmployee 
// and accesses the superclass�s private data via inherited 
// public methods.

public class BaseClass extends SuperClass
{
   private double baseSalary; // base salary per week

   // 3-argument constructor
   public BaseClass(double grossSales, double commissionRate, double baseSalary)
   {
      super(grossSales, commissionRate);                      
      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      
      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 

   // calculate earnings (override this method)
   @Override 
   public double earnings()
   {
	   //different implementation, hence different form
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
         super.toString(), "base salary", getBaseSalary());   
   } 
} 