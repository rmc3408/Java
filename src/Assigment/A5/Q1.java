package Assigment.A5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1 {

	/* Write a Java program that reads in a series 
	 * of first names and eliminates duplicates 
	 * by storing them in a set. Allow the user
	 *  to search for a given first name.*/

	public static void main(String[] args) {
		
		String [] names = { "sofia", "harry", "alice", "peter", "emily", "sofia", "mateo", "sofia" };
		System.out.printf("Names in a Array: \t");
		System.out.println(Arrays.asList(names));
		
		Set<String> uniqNames = new HashSet<String>(Arrays.asList(names));
		System.out.printf("Names in a set: \t");
		System.out.println(uniqNames);
		
		System.out.print("Enter a name, please: ");
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		
		System.out.printf("%nName %s part of array!", 
				uniqNames.contains(userInput.toLowerCase()) ? "is" : "is not");
		input.close();

	}

}
