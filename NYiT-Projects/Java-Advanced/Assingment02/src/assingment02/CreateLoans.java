package assingment02;

import javax.swing.JOptionPane;

public class CreateLoans implements LoanConstants {
	
	private static int SIZE = 5;
	
	public static void main(String[] args) throws LoanExceptions {
		
		Loan[] loan = new Loan[SIZE];
		int accontNum, loanType, term;
		double primeInterestRate, loanAmount;
		String input, name;
		int cont = 0;
		
		while (cont < SIZE ) {
			
			try {
				input = JOptionPane.showInputDialog(null, "Welcome to Sanches Construction\nEnter the current prime interest rate\nas decimal number, for example, .05");
				primeInterestRate = Double.parseDouble(input);
				
				input = JOptionPane.showInputDialog(null, "Is this a (1) - Business Loan, or a (2) - Personal Loan?");
				loanType = Integer.parseInt(input);
				
				input = JOptionPane.showInputDialog(null, "Enter a account number");
				accontNum = Integer.parseInt(input);
				
				name = JOptionPane.showInputDialog(null, "Enter name");
				
				input = JOptionPane.showInputDialog(null, "Enter Loan Amount");
				loanAmount = Double.parseDouble(input);
				
				input = JOptionPane.showInputDialog(null, "Enter term");
				term = Integer.parseInt(input);// throw(new ArithmeticException());
			
				//Construct the object
				if ( loanType == 1)
					loan[cont] = new BusinessLoan(accontNum, name, loanAmount, term, primeInterestRate);
				else if (loanType == 2)
					loan[cont] = new PersonalLoan(accontNum, name, loanAmount, term, primeInterestRate);
				
				cont++;
			}
			catch (LoanExceptions e) {
				JOptionPane.showMessageDialog(null, e.getMessage() + "\nThe max loan amount is: $" + MAX_LOAN_AMOUNT);
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"An number format Exception has occured!\nYou should inform a number!");
			}
		}
		displayLoans(loan, cont);
	}
	
	private static void displayLoans(Loan[] loan, int cont) {
		String display = "Sanches Construction\n";
		for (int i = 0; i < cont; i++ ) {
			display += loan[i].toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, display);
	}
}
