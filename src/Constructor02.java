
import java.util.Date;

public class Constructor02 extends Constructor
{
   private String firstName;  //We need to use,
   private Date hireDate;    //for methods from SuperClass
   private int id;

   // constructor to initialize name, birth date and hire date
   public Constructor02(String firstName, Date hireDate, int pid)
   {
      super(firstName, hireDate);
      this.id = pid;
   } 

   // Override ToString method from Constructor
   @Override
   public String toString()
   {
      return String.format("%s, ID: %d was hired on %s", 
         firstName, id, hireDate);
   } 
} 