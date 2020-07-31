package Assigment.A4Q1;

import java.util.ArrayList;

public class Harness {

    public static void main(String[] args) {

        // create subclass objects

        // Insurance general01 = new Insurance("Intact", 100); cannot instantiate
        // abstract
        Insurance myIns00 = new Health("Super Moon", 1500);
        Insurance myIns01 = new Life("SunLife", 250001);
        Health myIns02 = new Health("Sun", 2000);
        Life myIns03 = new Life("SunLife", 230200);

        System.out.println("Insurances processed:");

        System.out.printf("%s%n %s: %s%n%n", myIns00.getClass(), "Named ", myIns00.displayInfo());
        System.out.printf("%s%n %s: %s%n%n", myIns01.getClass(), "Named ", myIns01.displayInfo());
        System.out.printf("%s%n %s: %s%n%n", myIns02.getClass(), "Named ", myIns02.displayInfo());
        System.out.printf("%s%n %s: %s%n%n", myIns03.getClass(), "Named ", myIns03.displayInfo());

        // create four-element AbstractClass array
        Insurance[] insurances; // Create array not creating objects

        // initialize array with Insurances
        insurances[0] = myIns00;
        insurances[1] = myIns01;
        insurances[2] = myIns02;
        insurances[3] = myIns03;

        System.out.printf("Insurances processed polymorphically:%n%n");

        // generically process each element in array
        for (Insurance item : insurances) {

            System.out.println(item);
            System.out.println(item.displayInfo()); // invokes toString

            // determine whether element is a SubClass
            if (currentEmployee instanceof SubClass) {
                // downcast Employee reference to SubClass reference
                SubClass employee = (SubClass) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        // get type name of each object in employees array
        // getClass is from Object class.

    }
}