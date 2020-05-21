package exceptionHandling;
import java.util.Scanner;
public class DivisionMistakeCaught {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator, demoninator, result;
		
		System.out.print("Enter numerator >> ");
		numerator = input.nextInt();
		input.hasNextLine();
		
		System.out.print("Enter denominator >> ");
		demoninator = input.nextInt();
		input.hasNextLine();
		
		try {
			result = numerator / demoninator;
			System.out.println(numerator + "/" + demoninator + " = " + result);
		}
		catch(ArithmeticException mistake) {
			System.out.println("Arithmetic exception was thrown and caught!");
		}


		input.close();
		System.out.println("End program!");
	}
}

