package assingment02;

public class LoanExceptions  extends Exception {

	private static final long serialVersionUID = 6783016014154444197L;

	public LoanExceptions() {
		super("Loan is higher the the limit!");
	}
}
