import java.util.Scanner;

public class ifDemo {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre two numbers: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();
		
		if (a > b) {
			System.out.println(a + " is greater.");
		} 
		else {
			System.out.println(b + " is greater.");
		}
		
		sc.close();
	}

}
