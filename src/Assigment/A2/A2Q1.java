package Assigment.A2;


import java.util.Scanner;

public class A2Q1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter number: ");

		try {
			int numUser = input.nextInt();
			input.close();

			if (numUser < 0) {
				throw new NumberFormatException("Must be positive integer");

			}
			System.out.print(revertNum(numUser));

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception ex) {
			System.out.println("Invalid character");
		}

	}
	public static int revertNum(int num) {
		int count = 1;
		int numForward = num;
		while (num / 10 >= 1) {
			num = num / 10;
			count++;
		}
		int unit = 0;

		for (int i = count; i > 0; i--) {
			unit = unit + (((int) Math.pow(10, i - 1)) * (numForward % 10));
			numForward = numForward / 10;
		}

		return unit;
	}

}