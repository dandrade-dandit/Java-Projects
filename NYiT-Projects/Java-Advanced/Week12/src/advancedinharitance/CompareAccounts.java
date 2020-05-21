package advancedinharitance;

public class CompareAccounts {
	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount(1234, 500.00);
		BankAccount acct2 = new BankAccount(1234, 500.00);
		
		System.out.println(acct1);
		System.out.println(acct2.toString());
		
		if(acct1.equals(acct2))
			System.out.println("Accounts are same!");
		else
			System.out.println("Accounts are different!");
	}
}
