
public class BubbleSortExample {

	public static void main(String[] args) {
		int [] x = {19, 32, 12, 4};
		
		System.out.println("Before sorting:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();

		bubbleSort(x);
		
		System.out.println("After sorting:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
		
		
	}
	
	private static void bubbleSort (int[] arr) {
		int outer, inner;
		int temp;
		for (outer = arr.length -1; outer > 0; outer--) {
			for (inner = 0; inner < outer; inner++) {
				if (arr[inner] > arr[inner + 1]) {  
					temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
			}
		}
	}
	

}
