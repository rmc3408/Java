package Abstract;

// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class AbstractClass 
{
   private final String firstName;


   // constructor
   public AbstractClass(String firstName)
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
      return String.format("%s", getFirstName());
   } 

   // abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here



} 