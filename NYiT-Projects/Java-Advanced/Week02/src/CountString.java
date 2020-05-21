import java.util.Scanner;

public class CountString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the input string? ");
		String retorno = sc.nextLine();
		System.out.println(retorno + " has " + retorno.length() + " characters.");
		sc.close();
	}

}
