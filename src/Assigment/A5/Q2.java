package Assigment.A5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Q2 {
	/* Write a Java program that inserts 25 random integers from 0 to 100
	 * in order into a LinkedList object. The program should sort the elements,
	 *  then calculate the sum of the elements and the floating-point average of the elements.*/

	public static void main(String[] args) {
		
		
		Integer[] num = new Integer[25];
		Random r = new Random();
		for(int i = 0; i < num.length; i++) 
		{
			num[i] = r.nextInt(101);
		}
		LinkedList<Integer> numL = new LinkedList<Integer>(Arrays.asList(num));
		Collections.sort(numL);
		System.out.println(numL);
		
		int sum = numL.stream().mapToInt(Integer::intValue).sum();
		
		System.out.printf("%nThe sum of 25 random number are %d", sum);
		System.out.printf("%nThe average of random number are %.2f", ((float) sum/25));
		
	}

}
