import java.util.Scanner;

public class DemoDataTypes {
	public static void main(String[] args) {
		float x = 1.2f;
		double y = 1.2;
		char choice = 'y';
		//String name = "Anu\tGupta";
		int i = 10;
		boolean decision = true;
		
		//System.out.println ("Hello");
		//System.out.print("World\n");
		//System.out.println("My name is " + name + ". The value of i is: " + i);
		
		Scanner id =  new Scanner(System.in);
		
		String name;
		int ident;
		double salary;
		
		System.out.print("Enter the ID: ");
		ident = id.nextInt();
		
		System.out.print("Enter the name: ");
		id.nextLine();
		name = id.nextLine();
		
		System.out.print("Enter the Salary: ");
		salary = id.nextDouble();
		
		System.out.println("My name is " + name + ".\nThe ID is: " + ident + ".\nThe Salary is: " + salary);
		
		id.close();
		
	}

}
