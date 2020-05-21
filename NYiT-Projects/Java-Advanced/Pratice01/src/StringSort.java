public class StringSort {
	//Pratice 01
	public static void main(String[] args) {
		int[] arr = {3,2,5,1,4};
		System.out.print("\nBefore Sorting: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sort(arr);
		System.out.print("\nAfter Sorting: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		String[] arr2 = {"e", "b", "d", "c", "a"};
		System.out.print("\nBefore Sorting: ");
		for (String s: arr2) {
			System.out.print(s + " ");
		}
		sort(arr2);
		System.out.print("\nAfter Sorting: ");
		for (String s: arr2) {
			System.out.print(s + " ");
		}
		
	}
	
	static void sort (int[] arr) {
		int temp, outer, inner;
		for (outer = arr.length-1; outer > 0; outer-- ) {
			for (inner = 0; inner < outer; inner++) {
				if (arr[inner] > arr[inner + 1]){
					temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
			}
		}
	}
	
	static void sort (String[] arr) {
		int outer, inner;
		String temp;
		for (outer = arr.length-1; outer > 0; outer-- ) {
			for (inner = 0; inner < outer; inner++) {
				if (arr[inner].compareTo(arr[inner + 1]) >= 1){
					temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
			}
		}
	}
	
	
}
