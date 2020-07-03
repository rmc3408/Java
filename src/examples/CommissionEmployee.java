package examples;


public class CommissionEmployee extends Object {
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   // five-argument constructor                                       
   public CommissionEmployee(String firstName, String lastName,
      String socialSecurityNumber, double grossSales,
      double commissionRate) {

      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   }

   // return first name
   public String getFirstName() {
      return firstName;
   }

   // return last name
   public String getLastName() {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber() {
      return socialSecurityNumber;
   }

   // SET gross sales amount
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0)
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   }

   // GET return gross sales amount
   public double getGrossSales() {
      return grossSales;
   }

   // SET commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   }




   // return commission rate
   public double getCommissionRate() {
      return commissionRate;
   }

   // calculate earnings                 
   public double earnings() {
      return commissionRate * grossSales;
   }

   // return String representation of CommissionEmployee object         
   @Override // indicates that this method overrides a superclass method
   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
         "commission employee", firstName, lastName,
         "social security number", socialSecurityNumber,
         "gross sales", grossSales,
         "commission rate", commissionRate);
   }


   
}