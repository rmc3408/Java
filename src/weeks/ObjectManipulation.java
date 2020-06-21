package weeks;

import java.util.Scanner;


public class ObjectManipulation {

	public static void main(String[] args) {
		
		// Create a object calling constructor with 2 parameters
		ObjectManipulationClass myAcc = new ObjectManipulationClass("John", 38);
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.printf("the name is %s and age of %d .%n%n", myAcc.getName(), myAcc.getAge());
		
		System.out.print("What is the real name? ");
		String myName = input.nextLine();
		
		myAcc.setName(myName);
		System.out.printf("the name is %s and age of %d.%n", myAcc.getName(), myAcc.getAge());
		
		
		
		
	}

}
