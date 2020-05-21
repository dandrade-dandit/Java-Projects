package exceptionHandling;

public class HighBalanceException extends Exception {
	public HighBalanceException() {
		super("Customer Balance is high!");
	}
}
