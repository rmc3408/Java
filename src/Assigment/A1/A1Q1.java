package Assigment.A1;
import java.util.Scanner;


public class A1Q1 {

	
	public static void main(String[] args) 
	{
		//create to object to accept input from user 
		Scanner input = new Scanner(System.in);
		
		//Users enter input, convert to int and assign to variable.
		System.out.print("Please, enter first number: ");
		int numOne = input.nextInt();
		System.out.print("Please, enter second number: ");
		int numTwo = input.nextInt();
		System.out.print("Please, enter third number: ");
		int numThree = input.nextInt();
		
		// calculate product formula
		int productOfThree = numOne * numTwo * numThree;
		
		// Output of result.
		System.out.printf("The product of %d, %d and %d is %d.%n"
				, numOne, numTwo, numThree, productOfThree);
				
		input.close();
		
	}
	
}

