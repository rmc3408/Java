package Inheritance;

public class ExtendsTEST
{
   public static void main(String[] args) 
   {
      // instantiate Extends1 object
      Extends1 employee = new Extends1(
            "Bob", 5000, .04, 300);
      
      // get base-salaried commission employee data
      System.out.println("Employee information obtained by get methods:");
      
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.getGrossSales());

      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());

      System.out.printf("%s %.2f %n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000); 
      
      System.out.printf("%n%s: %s", 
         "Updated employee information obtained by toString:%n", 
         employee.toString());
   } 
} 