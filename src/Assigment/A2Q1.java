package Assigment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A2Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter number: ");
		
		try{
			int numUser = input.nextInt();
			if(numUser < 0){
				throw new InputMismatchException("Enter positive whole number");

			}
			input.close();
			System.out.print(revertNum(numUser));
			
		}catch(InputMismatchException e){
			//System.out.println("Please input a positive whole number.");
			System.out.println(e.getMessage());
		}
		
	}
	public static int revertNum(int num) 
	{
		int count = 1;
		int numForward = num;
		while (num / 10 >= 1) 
		{
            num = num / 10;
            count++;
		}
		int unit = 0;
				
		for (int i = count; i > 0;i--) 
		{
			unit = unit + (((int)Math.pow(10, i - 1)) * (numForward % 10));
			numForward = numForward / 10;
		}
		
		return unit;
	}
	
}
