package Inheritance;


public class Extends1 extends Extends0
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public Extends1(String firstName, double grossSales, 
      double commissionRate, double baseSalary)
   {
	  
      super(firstName, grossSales, commissionRate);                      

      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      
      this.baseSalary = baseSalary;                
   } 

   // Get return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 

   // calculate earnings by redefining ernings method
   //of superclass
   @Override 
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format("%s: %s %n%s: %.2f", "base-salaried",
         super.toString(), "base salary", getBaseSalary());   
   } 
} 