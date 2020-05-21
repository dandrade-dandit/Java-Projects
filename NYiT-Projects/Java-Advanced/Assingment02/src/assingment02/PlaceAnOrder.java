/*
 * Create an application that contains prompts for an item number and quantity. Allow for the possibility of
   nonnumeric entries as well as out-of-range entries and entries that do not match any of the currently
   available item numbers. The program should display an appropriate message if an error has occurred. If no
   errors exist in the entered data, compute the user’s total amount due (quantity times price each) and display
   it. Save the program as PlaceAnOrder.java.
 */
package assingment02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlaceAnOrder implements OrderInventory {
	public static void main(String[] args) {
		int item, qtd;
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter item number: ");
			item = input.nextInt();
			
			System.out.print("Enter quantity: ");
			qtd = input.nextInt();
			
			displayOrder(qtd, item);
	    }
		catch(InputMismatchException e) {
			System.out.println("Message is: null");
		}
		 catch(OrderException e) {
	         System.out.println("Message is: " + e.getMessage());
	    }
	    finally {
	    	input.close();
	    }
	}
	
	private static void displayOrder(int qtd, int item) throws OrderException {		
		if (item < 0)
			throw(new OrderException(1));  			//Error Code 1
		if (item > 9999)
			throw(new OrderException(2));			//Error Code 2
		if (qtd < 1)
			throw(new OrderException(4));			//Error Code 4
		if (qtd > 12)
			throw(new OrderException(5));			//Error Code 5
		if (!ORDER_INVENTORY.containsKey(item))
			throw(new OrderException(7));			//Error Code 7
		
		System.out.print("Order OK. Total is $" + (qtd * ORDER_INVENTORY.get(item) + "\n   (" + qtd + " at $" + ORDER_INVENTORY.get(item) + " each)" ));
	}
}
