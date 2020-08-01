package Assigment.A4Q2;


public class BusinessMortgage extends Mortgages {
	
	int serial = 0;
	public BusinessMortgage(String name, double a, double r, Term d) 
	{
		serial++;
		setNumM(serial);
		setName(name);
		setAmount(a);
		setRate(0.01 + r);
		setDuration(d);
		System.out.println("Business Mortgage Created!");
		System.out.println();
		
	}
	public double totalAmt() {
		return super.getAmount() + (super.getAmount() * super.getRate());
		
	}
	
	public void getMortgageInfo() {
		super.getMortgageInfo();
		System.out.printf("%nBusiness Mortgage%n");
		System.out.printf("Final Value is $%.2f%n%n", totalAmt() );
		
	}
	
	
}
