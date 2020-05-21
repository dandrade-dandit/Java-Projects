import java.util.Scanner;

public class SayHello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		System.out.println("Hello, " + name + ", nice to meet you!");
		sc.close();
	}

}
