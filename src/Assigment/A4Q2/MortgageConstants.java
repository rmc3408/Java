/**
 * 
 */
package Assigment.A4Q2;

/**
 * CityToronto bank provides mortgage to businesses up to $300,000.
 *  Write a Java application that keeps track of mortgages 
 *  and computes the total amount owed at any time (mortgage amount + interest). 
 *  
 *  Design the following classes to implement your application: 
 *  
 *  Mortgage  an abstract class that implements the MortgageConstants interface.
 *     A Mortgage includes a mortgage number, customer name, amount of mortgage,
 *      interest rate, and term. Dont allow mortgage amounts over $300,000.
 *      Force any mortgage term that is not defined in the MortgageConstants interface to a short-term, one year loan.
 *    Create a getMortgageInfo method to display all the mortgage data. 
 *    MortgageConstants  includes constant values for short-term (one year), medium-term (three years) and long-term (5 years) mortgages. 
 *    It also contains constants for bank name and the maximum mortgage amount.
 *     
BusinessMortgage  extends Mortgage. Its constructor sets the interest rate to 1% over the current prime rate. 
PersonalMortgage - extends Mortgage. Its constructor sets the interest rate to 2% over the current prime rate. 


ProcessMortgage  a main class that create an array of 3 mortgages. 
Prompt the user for the current interest rate. Then in a loop prompts the user
 for a mortgage type and all relevant information for that mortgage.
  Store the created Mortgage objects in the array. When data entry is complete,
   display all mortgages. 
 *
 */
public interface MortgageConstants {
	
	public enum Term { SHORT, MEDIUM, LONG };
	
	public final String BANK_NAME = "TD bank";
	public final double MAX_AMT = 300000;
	
	void getMortgageInfo();
	
}
