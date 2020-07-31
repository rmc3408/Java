package structure;
import javax.swing.JOptionPane ;

public class Dialogbox {

	public static void main(String[] args) {
		
		// obtain user input from JOptionPane input dialogs
		String firstNumber = JOptionPane.showInputDialog( "Enter first integer" );
		String secondNumber = JOptionPane.showInputDialog("Enter second integer");
		String thirdNumber = JOptionPane.showInputDialog("Enter last integer");
		
		// convert String inputs to int values for use in a calculation
		int number1 = Integer.parseInt( firstNumber );
		int number2 = Integer.parseInt(secondNumber);
		int number3 = Integer.parseInt(thirdNumber);
		int sum = number1 + number2 + number3; // add numbers
		
		// display result in a JOptionPane message dialog
		JOptionPane.showMessageDialog( null, "The sum is " + sum,
		"Sum of 3 Integers", JOptionPane.WARNING_MESSAGE );
	}
}
