package Assigment.A4Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Harness {

    public static void main(String[] args) {

        // User asks for type of insurance
        Scanner input = new Scanner(System.in);

        int myChoice = -1;
        
        // initialize array with Insurances
        ArrayList<Insurance> insurances = new ArrayList<Insurance>();


        while (myChoice != 0) 
        {

            System.out.println("Type the following option:");
            System.out.println("1 - Health Insurance");
            System.out.println("2 - Life Insurance");
            System.out.println("0 - See List of results");
            myChoice = input.nextInt();
            
            if (myChoice == 0) {
                break;
            }
            
            System.out.println("Enter the value:");
            double val = input.nextDouble();

            if (myChoice == 1) {
                insurances.add(new Health("Health", val));
            } else if (myChoice == 2) {
                insurances.add(new Life("Life", val));
            }
        }
        
        
        
        System.out.printf("%n%nInsurances processed polymorphically:%n%n");

        // generically process each element in array
        for (Insurance item : insurances) {
        	
            System.out.println(item.displayInfo()); // invokes entered value
            System.out.println("Would you like to add value? (enter 0 to skip)");
            double newVal = input.nextDouble();
            
            if (newVal != 0) {
            item.setInsuranceCost(newVal);
            System.out.println("New value for " + item.displayInfo());
            }
            System.out.println("------------------");
        }
        System.out.printf("%n--- End of Report -----");
        input.close();
    }
}