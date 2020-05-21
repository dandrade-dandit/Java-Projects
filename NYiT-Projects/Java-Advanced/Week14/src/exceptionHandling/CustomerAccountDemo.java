package exceptionHandling;

public class CustomerAccountDemo {

	public static void main(String[] args) {
		try {
			CustomerAccount ca = new CustomerAccount(12345, 30000);
			System.out.println("The balance is in the limits");
		}
		catch (HighBalanceException eca) {
			System.out.println(eca.getMessage());
		}
	}

}
