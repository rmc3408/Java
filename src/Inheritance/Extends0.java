package Inheritance;


public class Extends0
{
   private final String firstName;                              
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   // 3-argument constructor
   public Extends0(String firstName, double grossSales, 
      double commissionRate)
   {
      this.firstName = firstName;                                    
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // return first name
   public String getFirstName()
   {
      return firstName;
   }

   
   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      this.grossSales = grossSales;
   } 

   // Get return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      
      this.commissionRate = commissionRate;
   } 

   // Get return commission rate
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
      return String.format("%s: %s %n%s: %.2f %n%s: %.2f", 
         "commission employee", getFirstName(), 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
   } 
} 
