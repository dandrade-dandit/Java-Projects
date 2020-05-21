import java.util.Scanner;

public class Program4 {
	
	final static double PI = 3.14;
	
	public static void main(String[] args) {
		double v = 8;
		
		int i = (int)8.3;
		
		int radius;
		
		float area;
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a value for radius: ");
		
		radius = input.nextInt();
		
		
		//Explicit Type Conversion. Also Called Type Casting.
		//area = (float)PI * radius * radius;
		
		//Use of function or method
		area = calculateArea(radius);
		
		System.out.println("The area of circle is: " + area);
		
	}
	
	private static float calculateArea (int r) {
		
		return (float) (PI * r * r);
		
	}
}
