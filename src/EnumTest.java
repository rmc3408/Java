
import java.util.EnumSet;

// Testing enum type Book.
public class EnumTest 
{
   public static void main(String[] args) 
   {
      System.out.println("All books:");

      // print all books in enum Book                          
      for (Enum book : Enum.values())                        
         System.out.printf("%-10s%-45s%s%n", book,
             book.getTitle(), book.getCopyrightYear());

      System.out.printf("%nDisplay a range of enum constants:%n");
    
      // print first four books                                 
      for (Enum book : EnumSet.range(Enum.JHTP, Enum.CPPHTP))
         System.out.printf("%-20s %-45s %s  %n", book,
         book.getTitle(), book.getCopyrightYear());
   } 
}