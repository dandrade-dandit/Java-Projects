package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExceptionNew {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator, demoninator, result;
		
		try {
			System.out.print("Enter numerator >> ");
			numerator = input.nextInt();
			input.hasNextLine();
			
			System.out.print("Enter denominator >> ");
			demoninator = input.nextInt();
			input.hasNextLine();
			

			result = numerator / demoninator;
			
			System.out.println(numerator + "/" + demoninator + " = " + result);
		}
		catch (InputMismatchException e) {
			System.out.println("An input mismatch Exception has occured!");
		}
		catch (ArithmeticException e) {
			System.out.println("An Arithmetic Exception has occured!");
		}
		catch (Exception e) {
			System.out.println("An Exception has occured!");
		}
		finally {
			input.close();
			System.out.println("End Program!");
		}
	}

}
