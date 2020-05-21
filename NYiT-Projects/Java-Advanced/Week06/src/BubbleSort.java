
public class BubbleSort {
	
	public static void main(String[] args) {
		int [] x = {19, 32, 12, 4};
		
		System.out.println("Before sorting:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
		
		//BUBBLE SORT
		for (int i=0; i<x.length-1;i++) {
			for (int j=0; j < x.length-i-1; j++) {
				if (x[j] > x[j+1]) {
					int temp;
					temp = x[j];
					x[j] = x[j+1];
					x[j+1]=temp;
				}
			}
		}
		
		System.out.println("After sorting:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
		
		
		int[] y = {14, 22, 35, 7};
		
		System.out.println("Before sorting:");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + "\t");
		}
		System.out.println();
		
		bubbleSort(y);
		System.out.println("After sorting:");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + "\t");
		}
		System.out.println();
	}
	
	private static void bubbleSort (int[] a) {
		int outer, inner;
		int temp;
		for (outer = a.length -1; outer > 0; outer--) {
			for (inner = 0; inner < outer; inner++) {
				if (a[inner] > a[inner + 1]) {  
					temp = a[inner];
					a[inner] = a[inner + 1];
					a[inner + 1] = temp;
				}
			}
		}
	}
	
}
