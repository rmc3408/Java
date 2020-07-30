package Interface;


// Employee abstract superclass that implements Payable.

public abstract class Employee implements IPayable
{
   private final String firstName;
   

   // constructor
   public Employee(String firstName)
   {
      this.firstName = firstName;
      
   } 

   // return first name
   public String getFirstName()
   {
      return firstName;
   } 

   

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("Name: %s%n", getFirstName());
   }

   // Note: We do not implement Payable method getPaymentAmount here so 
   // this class must be declared abstract to avoid a compilation error.
} 