
import java.util.Date;

public class Constructor 
{
   private String firstName;
   private Date hireDate;

   // constructor to initialize name, birth date and hire date
   public Constructor(String firstName, Date hireDate)
   {
      this.firstName = firstName;
      this.hireDate = hireDate;
   } 

   // convert Employee to String format
   public String toString()
   {
      return String.format("%s, %s  Hired: %s  Birthday: %s", 
         firstName, hireDate);
   } 
} 