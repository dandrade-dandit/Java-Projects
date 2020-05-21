import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre the numbers: ");
		
		num = sc.nextInt();
		sc.nextLine();
		
		switch(num)
		{
		case 1:
			System.out.println("Case1: Value is: " + num);
			break;
		case 2:
			System.out.println("Case2: Value is: " + num);
			break;
		case 3:
			System.out.println("Case3: Value is: " + num);
			break;
		default:
			System.out.println(num + " is not a valid Case.");
		}
		
		sc.close();

	}

}
