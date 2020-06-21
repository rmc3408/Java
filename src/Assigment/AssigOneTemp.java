
import java.util.Scanner;

public class AssigOneTemp {

	public static void main(String[] args) {
		
		Scanner inputTemp = new Scanner(System.in);
		
		//declare two temperature variables
		double celTemp;
		double fahTemp;
		
		//Users question, input value, convert to double and assign to variable.         
        System.out.print("Please, enter temperature in Fahrenheit: ");
        fahTemp = inputTemp.nextDouble();
        
        //Formula to calculate
        celTemp = (fahTemp - 32) * (0.5556);
        
        //Output results.
        System.out.printf("Temperature in Celsius is %.1f", celTemp);       

	}

}
