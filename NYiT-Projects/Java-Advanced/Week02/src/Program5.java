import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		float area;
		float v1, v2;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the first value: ");
		
		v1 = input.nextFloat();
		
		System.out.print("Enter the second value: ");
		
		v2 = input.nextFloat();
		
		//Use of function or method
		area = calculateArea(v1, v2);
		
		System.out.println("The area is: " + area);
		
	}
	
	private static float calculateArea (float v1, float v2) {
		return (v1 * v2);
	}
}
