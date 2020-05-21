import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SortPurchasesArray {

	public static void main(String[] args) {
		ArrayList<NewPurchase> p = new ArrayList<NewPurchase>();
		
		int cont = 0;
		int selection;
		boolean isYes=true;
		
		while (isYes) {
			int invoiceNumber = getInvoiceNumFromUser();
			double salesAmount = getSalesAmountFromUser();
			
			p.add(cont, new NewPurchase(invoiceNumber, salesAmount));
			cont++;
//			if (cont > 4) {
//				isYes = false;
//				break;
//			}
			
			selection = JOptionPane.showConfirmDialog(null, "Do you want to inform another Invoice?", "Make your choice!", JOptionPane.YES_NO_OPTION);
			isYes = (selection ==  JOptionPane.YES_OPTION);
		}
		
		String returnQuestionPrint = JOptionPane.showInputDialog(null, "Do you want to print the information sorted by Invoice Number or Sales Amount?\n[I=Invoice Number/S=Sales Amount]");
		
		if (returnQuestionPrint.charAt(0) == 'S') {
			displayBySalesAmount(p);
		} else {
			displayByInvoice(p);
		}

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
	
	private static void bubbleSortPurchagesByInvoiceNum (ArrayList<NewPurchase> arr) {
		for (int outer = arr.size() -1; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {				
				if (arr.get(inner).getInvoiceNumber() > arr.get(inner + 1).getInvoiceNumber()) {  
					NewPurchase temp;
					temp = arr.get(inner);
					arr.set(inner, arr.get(inner + 1));
					arr.set(inner + 1, temp);
				}
			}
		}
	}
	
	private static void bubbleSortPurchagesBySalesAmount (ArrayList<NewPurchase> arr) {
		for (int outer = arr.size() -1; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {
				if (arr.get(inner).getSalesAmount() > arr.get(inner + 1).getSalesAmount()) {  
					NewPurchase temp;
					temp = arr.get(inner);
					arr.set(inner, arr.get(inner + 1));
					arr.set(inner + 1, temp);
				}
			}
		}
	}
	
	public static void displayBySalesAmount(ArrayList<NewPurchase> arr) {
		bubbleSortPurchagesBySalesAmount(arr);
		displayPurchages(arr);
		
	}
	
	public static void displayByInvoice (ArrayList<NewPurchase> arr) {
		bubbleSortPurchagesByInvoiceNum(arr);
		displayPurchages(arr);
	}
	
	private static void displayPurchages (ArrayList<NewPurchase> arr) {
		String display="";
		for (int i = 0; i < arr.size(); i++) {
			display += (i+1) + " - The Invoice Number: " + arr.get(i).getInvoiceNumber() + " costs $" + arr.get(i).getSalesAmount() + " with $" + arr.get(i).getSalestax() + " of sales tax.\n";
		}
		JOptionPane.showMessageDialog(null, display);
	}
}