package Assigment.A4Q2;

public abstract class Mortgages implements MortgageConstants {
	int numM;
	String name;
	double amount;
	double rate;
	Term duration;

	public void getMortgageInfo() {
		System.out.printf("Mortgage number: %d%n", getNumM());
		System.out.printf("Customer name: %s%n", getName());
		System.out.printf("Amount loan: $%.2f%n", getAmount());
		System.out.printf("Loan Rate: %.2f%n", getRate());
		System.out.printf("Term period: %s", getDuration());
	}

	public int getNumM() {
		return numM;
	}

	public void setNumM(int numM) {
		this.numM = numM;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		if (amount > 300000) {
			throw new IllegalArgumentException("Value exceed!");
		}
		this.amount = amount;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Term getDuration() {
		return duration;
	}

	public void setDuration(Term d) {
		if (d == Term.LONG || d == Term.MEDIUM) {
			this.duration = Term.SHORT;
		} else {
			this.duration = d;
		}

	}

}