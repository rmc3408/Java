package weeks;

import java.util.Scanner;

public class StringNumberManipulation {

	public static void main(String[] args) {
			
		System.out.printf("Hello Class%n");
		
		float num1 = 6;
		float num2 = 10;
		float sum = num1 + num2;
		float div = num2 / num1;
		
		System.out.printf("the Sum is %f%n", sum);  //%f = float 
		System.out.println("Number = " + num2);
				
		System.out.printf("the division is %f%n", div);
		System.out.printf("the division is %.2f", div);
		
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
		
        System.out.print("Enter string: ");
        String myStr = input.next();
        System.out.println("The string entered = " + myStr);
        
		

	}

}
