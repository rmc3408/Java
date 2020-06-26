package Assigment;
import java.util.Scanner;
import java.lang.Math;

public class A1Q1 {

	
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter number: ");
		int numUser = input.nextInt();
		input.close();

			
		
		System.out.print(revertNum(numUser));
		

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

