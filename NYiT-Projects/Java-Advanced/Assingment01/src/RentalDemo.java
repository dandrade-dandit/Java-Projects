import java.util.Scanner;

public class RentalDemo {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Rental r1 = new Rental();
		
		String contract = getContractFromUser();
		int rentalMin = getRentalMinFromUser();
		
		Rental r2 = new Rental(contract, rentalMin);
		
		displayDetails(r1);
		displayDetails(r2);
		
		sc.close();
	}
	
	private static String getContractFromUser() {
		System.out.print("Enter with the Contract Number: ");
		String contract = sc.nextLine();		
		return contract;
	}
	
	private static int getRentalMinFromUser() {
		System.out.print("Enter with the number of minutes: ");
		int rentalMin = sc.nextInt();
		sc.hasNextLine();
		return rentalMin;
	}
	
	private static void displayDetails(Rental r) {
		System.out.println("The Contract Number: " + r.getContractNumber() + " had " + r.getQtdHours() + " hours and " + r.getQtdExtraMinutes() + " minutes. The total price of the rental was: " + r.getPrice() + ".");
	}
	
}
