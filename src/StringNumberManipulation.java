import java.util.Scanner;

public class StringNumberManipulation {

	public static void main(String[] args) {
			
		//Output object
		System.out.printf("Hello Class%n");
		
		//////////////////////////////////
		// Eight primitive datatypes:
		//byte, short, int, double, float, boolean, char,  long
		///////////////////////////////////

		byte i = 4;
		float num1 = 6f;
		float num2 = 10f;
		float sum = num1 + num2;
		float div = num2 / num1;
				

		// PRINTF is format specifier.
		System.out.printf("the Sum is %f%n", sum);  //%f = float 
		System.out.println("Number = " + num2);
		System.out.printf("primitive datatype is %b%n%n", i);	
			
		//System.out.printf("the division is %f%n", div);
		System.out.printf("the division is %4.1f%n", div); //4 space before number
		System.out.printf("the division is %-4.1f%n", div); //4 space after number
		System.out.printf("the division is %04.1f%n", div); //zero in 4 space before number
		
		System.out.printf("the division is %.2f%n", div);
		
		// %d - integersd
		// %s - string
		// %f - double and float
		
		//enables a program to read data for use in a program.
		Scanner input = new Scanner(System.in);
		
		// To get user INPUT, convert string in numbers !!
		System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
		
		// To get user INPUT and keep as string.
        System.out.print("Enter string: ");
        String myStr = input.next();
        System.out.println("The string entered = " + myStr);
		
		System.out.print("Enter string 01: ");
		String myStr01 = input.next();
		System.out.print("Enter string 02: ");
        String myStr02 = input.next();
		System.out.println(myStr01 + myStr02);
		
		input.close();

	}

}
