
import java.awt.Point;
import java.util.Scanner;

		//! Object = property and operation
		
	
//driver class - it will use other class to instantiate obj.		
public class ObjectManipulation {

	public static void main(String[] args) {
	
		
	//pimitive datatypes:
    //byte, short, int, double, float, boolean, char,  long
	// no need of new and constructor.
	// Primitives only have atributte(so, no methods) and store only one value.
	
	//ALL Rest are objects with methods and properties.
	// arrays, enum, classes ,...

	//String is a special object, do not require new+Constructor.
	String s = "molinaro";
	System.out.println(s);
	s = new String("Raphael");
	System.out.println(s);

	// Objects can contain data.

		Point myPoint = new Point();
		myPoint.x = 2;
		myPoint.y = 5;

		

		ObjectManipulationClass.serial = 2;
	// Create a object from other file. 	
	// calling constructor with 2 parameters
	ObjectManipulationClass myAcc = new ObjectManipulationClass("John", 38);
		
	// myAcc.serial = 2; Not appropriate - serial is associate with class, not object.	
		Scanner input = new Scanner(System.in);
		System.out.printf("the name is %s and age of %d .%n%n", myAcc.getName(), myAcc.getAge());
		System.out.print("What is the real name? ");
		String myName = input.nextLine();
		


		myAcc.setName(myName);
		System.out.printf("the name is %s and age of %d.%n", myAcc.getName(), myAcc.getAge());
		
		
		input.close();
		


	}

}
