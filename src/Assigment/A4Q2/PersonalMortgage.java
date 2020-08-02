package Assigment.A4Q2;

public class PersonalMortgage extends Mortgages {

	int serial = 0;
	public PersonalMortgage(String name, double a, double r, Term d) 
	{
		serial++;
		setNumM(serial);
		setName(name);
		setAmount(a);
		setRate(0.02 + r);
		setDuration(d);
		System.out.println("Personal Mortgage Created!");
		System.out.println();
		
	}
	public double totalAmt() {
		return super.getAmount() + (super.getAmount() * super.getRate());
		
	}
	
	public void getMortgageInfo() {
		super.getMortgageInfo();
		System.out.printf("%nPersonal Mortgage%n");
		System.out.printf("Final value is $%.2f%n%n", totalAmt() );
	}
}
