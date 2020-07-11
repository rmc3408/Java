package Assigment.A2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A2Q2 {

    public static void main(String[] args) {
        //create user input object
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Please, enter number: ");
            int numUser = input.nextInt();

            System.out.printf("%nFirst method = Number %d in isEven() say is %b%n", numUser, isEven(numUser));
            System.out.printf("%nSecond method: enterScale() returns = %d%n%n", enterScale(numUser));
            input.close();
        } catch (InputMismatchException e) {
            System.out.printf("%n-----------------%n");
            System.out.printf("Invalid character%n");
            System.out.printf("-----------------%n%n%n");

        } catch (IllegalArgumentException e) {
            System.out.printf("%n---------------------------------%n");
            System.out.printf("User input a Invalid range%n");
            System.out.printf("Exception: %s%n", e.getMessage());
            System.out.printf("---------------------------------%n%n");
        }

    }
    public static boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }
    public static int enterScale(int num) {
        if (num > 100) {
            throw new IllegalArgumentException("No more than 100");
        }
        if (num / 10 < 6) {
            return 0;
        } else if (num / 10 == 6) {
            return 1;
        } else if (num / 10 == 7) {
            return 2;
        } else if (num / 10 == 8) {
            return 3;
        } else {
            return 4;
        }

    }
}