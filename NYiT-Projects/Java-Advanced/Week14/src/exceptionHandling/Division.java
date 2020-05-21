package exceptionHandling;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator, demoninator, result;
		
		System.out.print("Enter numerator >> ");
		numerator = input.nextInt();
		input.hasNextLine();
		
		System.out.print("Enter denominator >> ");
		demoninator = input.nextInt();
		input.hasNextLine();
		
		if (demoninator == 0) {
			System.out.println("The denominator cannot be zero!");
		}
		else {
			result = numerator / demoninator;
			
			System.out.println(numerator + "/" + demoninator + " = " + result);
		}
		input.close();
	}
}
