package exceptionHandling;

import java.util.Scanner;

public class BadSubscriptCaught {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = {"Ann", "Paul", "Denis", "Charles", "Mary", "Gina", "Joan", "Beth"};
		int pos;
		
		try {
			System.out.print("Enter a number, and I will display a name >> ");
			pos = input.nextInt();
			input.hasNextLine();
			
			System.out.println ("Name is " + names[pos-1]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Subscript out of range!");
		}
		catch (Exception e) {
			System.out.println("An Exception has occured!");
		}
		finally {
			input.close();
		}
	}
}
