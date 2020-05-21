package assingment02;

public class PersonalLoan extends Loan {

	public PersonalLoan(int loanNum, String customerLastName, Double loanAmount, int term, double interestRate) throws LoanExceptions {
		super(loanNum, customerLastName, loanAmount, term);
		this.interestRate = interestRate + 0.02;
	}

}
