package Polymorphism;


// Assigning superclass and subclass references to superclass and
// subclass variables.

public class PolymorphismTest  
{
   public static void main(String[] args) 
   {
      // assign superclass reference to superclass variable
      SuperClass commissionEmployee = new SuperClass(10000, .06);                    

      // assign subclass reference to subclass variable
      BaseClass basePlusCommissionEmployee = new BaseClass(5000, .04, 300);         

      // invoke toString on superclass object using superclass variable
      System.out.printf("%s %s:%n%n%s%n%n", 
         "Call CommissionEmployee's toString with superclass reference ",
         "to superclass object", commissionEmployee.toString());

      // invoke toString on subclass object using subclass variable      
      System.out.printf("%s %s:%n%n%s%n%n", 
         "Call BasePlusCommissionEmployee's toString with subclass",
         "reference to subclass object", 
         basePlusCommissionEmployee.toString());

      // invoke toString on subclass object using superclass variable
      
      
      //hold a subclass object in a superclass reference
      //because of the "is a" relationship
      //call subclass methods on the superclass reference
      SuperClass commissionEmployee2 = basePlusCommissionEmployee; 

      System.out.printf("%s %s:%n%n%s%n", 
         "Call BasePlusCommissionEmployee's toString with superclass",
         "reference to subclass object", commissionEmployee2.toString());
   } 
} 