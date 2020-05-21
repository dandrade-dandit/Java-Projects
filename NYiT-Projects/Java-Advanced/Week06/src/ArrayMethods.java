import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		int[] nums2 = {56,4,7,2,90};
		
		
		for (int element:nums) {
			System.out.print(element + "\t");
		}
		
		System.out.print("\n");
		Arrays.fill(nums, 8);
		
		for (int element:nums) {
			System.out.print(element + "\t");
		}
		
		System.out.print("\n");
		Arrays.sort(nums2);
		
		for (int element:nums2) {
			System.out.print(element + "\t");
		}

	}

}
