import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre two numbers: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();
		
		int maxValue = ((a > b) ? a : b);
		
		System.out.println(maxValue + " is greater.");
		
		sc.close();

	}

}
