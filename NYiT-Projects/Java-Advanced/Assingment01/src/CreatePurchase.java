import javax.swing.JOptionPane;

public class CreatePurchase {

	public static void main(String[] args) {
		
		int invoiceNumber = getInvoiceNumFromUser();
		double salesAmount = getSalesAmountFromUser();
		
		Purchase p1 = new Purchase(invoiceNumber, salesAmount);
		
		displayPurchaseDetails(p1);
	}
	
	private static int getInvoiceNumFromUser() {
		int invoiceNumber;
		do {
			invoiceNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter with The Invoice Number:"));
			if (invoiceNumber < 1000 || invoiceNumber > 8000) JOptionPane.showMessageDialog(null, "Invoice Number is not valid. Inform a valid Invoice Number.");
		} while (invoiceNumber < 1000 || invoiceNumber > 8000);
		
		return invoiceNumber;
	}
	
	private static double getSalesAmountFromUser() {
		double salesAmount;
		do {
			salesAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter with The Sales Amount:"));
			if (salesAmount < 0) JOptionPane.showMessageDialog(null, "Sales Amount is not valid. Inform a Sales Amount greater than 0.");
		} while (salesAmount < 0);
		
		return salesAmount;
	}
	
	public static void displayPurchaseDetails(Purchase p) {
		JOptionPane.showMessageDialog(null, "The Invoice Number: " + p.getInvoiceNumber() + " costs $" + p.getSalesAmount() + " with $" + p.getSalestax() + " of sales tax.");
	}

}
