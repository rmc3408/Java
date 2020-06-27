package Assigment;

import java.util.Scanner;
import java.util.stream.IntStream;

public class A2Q2 {
    public static void main(String[] args) 
    {
		//create user input object
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter number: ");
		int numUser = input.nextInt();
        input.close();
        
        System.out.printf("the number %d is a %b Even!%n", numUser, isEven(numUser));
        System.out.printf("And the scale number is %d!", enterScale(numUser));
    
    }
    public static boolean isEven(int num)
    {
        return num % 2 == 0 ? true : false;
    }
    public static boolean enterScale(int num)
    {
        
        IntStream bottom = IntStream.range(0, 60);
        IntStream medium = IntStream.range(60, 70);
        IntStream low = IntStream.range(70, 80);
        IntStream under = IntStream.range(80, 90);
        IntStream top = IntStream.range(90, 100);
        

        if (new )
        {
            System.out.println("between 0 and 59");
        } 
        else if (IntStream.range(60, 69))
        {
            // do something else 
        }
        if (num % 2 == 0)
        {
            return true;
        } 
        else 
        {
            return false;
        }


    }
}