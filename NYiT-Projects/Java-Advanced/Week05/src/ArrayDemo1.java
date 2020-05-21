
public class ArrayDemo1 {

	public static void main(String[] args) {
//		final int SIZE=3;
//		int[] nums = new int[SIZE];
		
//		nums[0]=9;
//		nums[1] = 19;
//		nums[2] = 3;
		
		int[] nums = {3, 5, 7, 4, 2, 1, 6, 9, 8, 10, 12, 11}; //Initialization List
		
		System.out.println("The array elements: ");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		
		System.out.println("");
		
		for (int elements:nums) {
			System.out.print(elements + "\t");
		}
		
		System.out.println("\nThe array elements: ");
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] += 3;
			System.out.print(nums[i] + "\t");
		}
	}

}
