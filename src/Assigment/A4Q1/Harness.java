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


        while (myChoice != 0) {

            System.out.println("Choose the following option:");
            System.out.println("1 - Health Insurance");
            System.out.println("2 - Life Insurance");
            System.out.println("0 - Exit");
            myChoice = input.nextInt();

            System.out.println("Enter the value:");
            double val = input.nextDouble();

            if (myChoice == 1) {

                insurances.add(new Health("Health", val));
                

            } else if (myChoice == 2) {
                insurances.add(new Life("Life", val));

            } else if (myChoice == 0) {
                break;
            }
            input.close();
        }

        // create four-element AbstractClass array

        System.out.printf("%n%nInsurances processed polymorphically:%n%n");

        // generically process each element in array
        for (Insurance item : insurances) {

            System.out.println(item.displayInfo()); // invokes toString

        }
    }
}