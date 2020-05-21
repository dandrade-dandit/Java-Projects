
import java.util.Scanner;

public class TestSandwich {
	
	public static void main(String[] args) {
		Sandwich s = new Sandwich();
		String mainIngred, breadType;
		Double price;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with the Main Ingredient : ");
		mainIngred = sc.nextLine();
		System.out.print("Entre with the Bread Type : ");
		breadType = sc.nextLine();
		System.out.print("Enter with the Sandwich Price : ");
		price = sc.nextDouble();
		sc.nextLine();
		
		s.setMainIngredient(mainIngred);
		s.setBreadType(breadType);
		s.setPrice(price);
		
		System.out.println();
		System.out.println("The Sandwich details are : ");
		System.out.println("Main Ingredient : " + s.getMainIngredient() + "\nBread Type is   : " + s.getBreadType() + "\nPrice is        : " + s.getPrice() );
	
		sc.close();
	}

}
