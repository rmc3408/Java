package Interface;


// SalariedEmployee class that implements interface Payable.
// method getPaymentAmount.
public class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   // constructor
   public SalariedEmployee(String firstName, double weeklySalary)
   {
      super(firstName); 
      this.weeklySalary = weeklySalary;
   } 

   // set salary
   public void setWeeklySalary(double weeklySalary)
   {

      this.weeklySalary = weeklySalary;
   } 

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } 

   // calculate earnings; implement interface Payable method that was
   // abstract in superclass Employee                                
   @Override                                                         
   public double getPaymentAmount()                                  
   {                                                                 
      return getWeeklySalary();                                      
   } 

   // return String representation of SalariedEmployee object   
   @Override                                                    
   public String toString()                                     
   {                                                            
      return String.format("salaried employee: %s%n %s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   } 
} 