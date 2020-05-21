package assingment02;

public class Loan implements LoanConstants {
	protected int loanNum;
	protected String customerLastName;
	protected Double loanAmount;
	protected Double interestRate;
	protected int term;
	
	public Loan (int loanNum, String customerLastName, Double loanAmount, int term) throws LoanExceptions
	{
		this.loanNum = loanNum;
		this.customerLastName = customerLastName;
		this.loanAmount = loanAmount;
		
		
		if (this.loanAmount > MAX_LOAN_AMOUNT)
			throw(new LoanExceptions());
		
		if (term == SHORT_TERM)
			this.term = term;
		else if (term == MEDIUM_TERM)
			this.term = term;
		else if (term == LONG_TERM)
			this.term = term;
		else
			this.term = SHORT_TERM;
	}
	
	@Override
	public String toString() {
		return "Loan #" + loanNum + "\tName: " + customerLastName + "\t$" + loanAmount +
				"\nfor " + term + " year(s) at " + (int)(interestRate * 100) + "% interest.";
	}

}
