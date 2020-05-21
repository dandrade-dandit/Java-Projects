
public class Loop1Demo {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 15; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int j = 1;		
		while (j <= 15) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();
		
		j = 1;	
		do {
			System.out.print(j + " ");
			j++;
		} while (j <= 15) ;
		System.out.println();
		
		for (int i = 15; i >= 1; --i) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 2; i <= 15; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
