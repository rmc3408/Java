package Polymorphism;


// CommissionEmployee class uses methods to manipulate its 
// private instance variables.

public class SuperClass
{
   
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   // five-argument constructor
   public SuperClass(double grossSales, double commissionRate)
   {
      
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      
      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      
      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } 

   // return String representation of CommissionEmployee object
   @Override 
   public String toString()
   {
      return String.format("%s: %.2f%n %s: %.2f%n",
        "Gross sales", getGrossSales(), 
         "Commission rate", getCommissionRate());
   } 
} 