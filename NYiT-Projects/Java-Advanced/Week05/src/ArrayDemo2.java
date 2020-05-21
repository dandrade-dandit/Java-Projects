import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] itemCodes = {110, 201, 305, 406, 608};
		double[] prices = {4000.8, 555.3, 1111.5, 9000, 3090.8};
		int item, priceLoc=0;
		boolean isValid = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter the item code: \r");
		item=sc.nextInt();
		sc.hasNextLine();
		
		for (int i = 0; i < itemCodes.length; i++) {
			if (item == itemCodes[i]) {
				isValid=true;
				priceLoc=i;
				break;
			}
		}
		
		if(isValid) {
			System.out.println ("The item code: " + item + " was found in the arryay. The price is: " + prices[priceLoc] + "\r");
		} else {
			System.out.println ("The item code: " + item + " was not found in the arryay.\r");
		}
		
		sc.close();
	}

}
