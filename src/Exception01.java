import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	// Throws Methods if this fails.
	public static int quotient( int numerator, int denominator ) throws ArithmeticException
	{
	return numerator / denominator; // possible division by zero
	}
	
	public static void main( String args[] )
	{
	Scanner scanner = new Scanner( System.in );
	System.out.print( "Please enter an integer numerator: " );
	int numerator = scanner.nextInt();
	
	System.out.print( "Please enter an integer denominator: " );
	int denominator = scanner.nextInt();
	
	int result = quotient( numerator, denominator );
	System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result );
	scanner.close();
	
	
	Scanner input = new Scanner(System.in); 
	boolean continueLoop = true;
	
		do
		{
			try
			{
				System.out.print( "Please enter an integer numerator: " );
				int numerator2 = input.nextInt();
				System.out.print( "Please enter an integer denominator: " );
				int denominator2 = input.nextInt();
				int result2 = quotient( numerator, denominator );
				System.out.printf( "\nResult: %d / %d = %d\n", numerator2, denominator2, result2 );
				
				//If sucessful, continue to false.	
				continueLoop = false;
			
			
			}catch (InputMismatchException inputMismatchException) {
			
				System.err.printf("\nException: %s\n", inputMismatchException );
				input.nextLine(); // discard input cursor so user can try again
				System.out.println("You must enter integers. Please try again.\n" );
				
			} catch ( ArithmeticException arithmeticException )
			{
				System.err.printf("\nException: %s\n", arithmeticException );
				System.out.println("Zero is an invalid denominator. Please try again.\n" );
			}
		input.close();
		}while ( continueLoop ); // input successful; end looping
			
	}
}

