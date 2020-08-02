package Assigment.A4Q2;

import java.util.Scanner;
import Assigment.A4Q2.MortgageConstants.Term;

public class ProcessMortgage {

	
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);

		Mortgages[] users = new Mortgages[3];
		
		for(int i=0; i < 3; i++) 
		{
			System.out.printf("User 0%d - personal or business? ", i+1);
			String typeM = input.next();
			System.out.printf("User 0%d - Enter Customer name? ", i+1);
			String cName = input.next();
			System.out.printf("User 0%d - Enter Amount Value? ", i+1);
			double cValue = input.nextDouble();
			System.out.printf("User 0%d - Enter rate? ", i+1);
			double cTax = input.nextDouble();
			
			
			if(typeM.contentEquals("business")) 
			{
				BusinessMortgage user = new BusinessMortgage(cName, cValue, cTax, Term.LONG);
				users[i] = user;
			}
			else if(typeM.contentEquals("personal")) 
			{
				PersonalMortgage user = new PersonalMortgage(cName, cValue, cTax, Term.MEDIUM);
				users[i] = user;
			}
			
		}
		System.out.println();
		
		for (Mortgages u : users){
			
			u.getMortgageInfo();
		}
		input.close();
	}

}
