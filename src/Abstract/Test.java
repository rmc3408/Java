package Abstract;

// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class Test {
   public static void main(String[] args) {
      // create subclass objects
      SuperClass commissionEmployee = new SuperClass("Sue", 10000, .06);
      SubClass basePlusCommissionEmployee = new SubClass("Bob", 5000, .04, 300);

      System.out.println("Employees processed individually:");

      System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());

      System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned",
            basePlusCommissionEmployee.earnings());

      // create four-element AbstractClass array
      AbstractClass[] employees = new AbstractClass[2];

      // initialize array with Employees
      employees[0] = commissionEmployee;
      employees[1] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (AbstractClass currentEmployee : employees) {
         
         System.out.println(currentEmployee); // invokes toString


         // determine whether element is a SubClass
         if (currentEmployee instanceof SubClass) 
         {
            // downcast Employee reference to SubClass reference
            SubClass employee = (SubClass) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
         }

         System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
      }

      // get type name of each object in employees array
      // getClass is from Object class.

      for (int j = 0; j < employees.length; j++)
         System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());

   }
}
