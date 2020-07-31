package Assigment.A4Q1;

import java.util.ArrayList;

public class Harness {
    
    public static void main(String[] args) {
        
       Insurance[] insurances; //Create array
       

        // create subclass objects
        Insurance commissionEmployee = new SuperClass("Sue", 10000, .06);
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

        
        String[] buttons = { "Health Insurance", "Life Insurance", "Done adding"};
        int rc = 0;
        String insuranceType;
        double insuranceCost;

        //add insurance objects until user gets bored of the process and quits
        while (rc != 2){
            rc = JOptionPane.showOptionDialog(
                    null,
                    "What type of insurance are you processing?",
                    "Enter Type", JOptionPane.DEFAULT_OPTION, 3, null, buttons, buttons[2]);

            switch (rc){
                case 0: //health insurance
                    insuranceType = JOptionPane.showInputDialog("Please enter health insurance type");
                    insuranceCost = Double.parseDouble(JOptionPane.showInputDialog("Please enter the monthly fee for " + insuranceType));
                    try {
                        insuranceList.add(new Health(insuranceType, insuranceCost));
                    }
                    catch (Exception e){
                        insuranceList.add(new Health(insuranceType, 0));
                        JOptionPane.showMessageDialog(null, String.format("%s%n%s", e.getMessage(), "Cost temporarily set to $0"));
                    }
                    JOptionPane.showMessageDialog(null,"Health insurance added to list");
                    break;
                case 1: //life insurance
                    insuranceType = JOptionPane.showInputDialog("Please enter life insurance type");
                    insuranceCost = Double.parseDouble(JOptionPane.showInputDialog("Please enter monthly fee for " + insuranceType));
                    try {
                        insuranceList.add(new Life(insuranceType, insuranceCost));
                    }
                    catch (Exception e){
                        insuranceList.add(new Life(insuranceType, 0));
                        JOptionPane.showMessageDialog(null, String.format("%s%n%s", e.getMessage(), "Cost temporarily set to $0"));
                    }
                    JOptionPane.showMessageDialog(null,"Life insurance added to list");
                    break;
            }
        }

        //convert list to array
        insurances = new Insurance[insuranceList.size()];
        insurances = insuranceList.toArray(insurances);

        //show all added insurances
        for (int i = 0; i < insurances.length; i++) {
            //ask whether client wants to change
            int selectedOption = JOptionPane.showConfirmDialog(null,
                    String.format("%s#%d?%n%s%n", "Change data for insurance ", i+1, insurances[i].displayInfo()),
                    "Set premiums",
                    JOptionPane.YES_NO_OPTION);
            boolean changePremiums = (selectedOption == JOptionPane.YES_OPTION);
            while (changePremiums){
                double newPremium = Double.parseDouble(JOptionPane.showInputDialog("Please enter new monthly premiums"));
                try{
                    insurances[i].setInsuranceCost(newPremium);
                    changePremiums = false;
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            JOptionPane.showMessageDialog(null, String.format("%s#%d%n%s%n", "Final details for ", i+1, insurances[i].displayInfo()));
        }
    }
}