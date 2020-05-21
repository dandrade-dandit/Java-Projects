
public class ArrayExample1 {

	public static void main(String[] args) {
		int [] x = {5, 10, 15, 20};
		
		System.out.println("At the beginning of main:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
		
		//PASS BY VALUE
		for (int i = 0; i < x.length; i++) {
			methodOne(x[i]);
		}

		System.out.println("At the end of main:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
		
		//PASS BY REFERENCE
		methodTwo(x);
		System.out.println();
		System.out.println("At the end of main again:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
	}
	
	public static void methodOne (int element) {
		System.out.println("Inside methodOne:");
		System.out.println("Original value:" + element + "\t");
		element = 999;
		System.out.println("New value:" + element + "\t");
	}

	public static void methodTwo(int[] array) {
		System.out.println("Inside methodOne:");
		System.out.println("Original array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] = 999;
		}

		System.out.println("New array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
