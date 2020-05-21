package assingment02;

public class BusinessLoan extends Loan {

	public BusinessLoan(int loanNum, String customerLastName, Double loanAmount, int term, double interestRate) throws LoanExceptions {
		super(loanNum, customerLastName, loanAmount, term);
		this.interestRate = interestRate + 0.01;
	}


}
