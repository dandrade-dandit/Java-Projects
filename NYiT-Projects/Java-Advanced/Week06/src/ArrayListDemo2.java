import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList names = new ArrayList<>();
		
		System.out.println(names);
		names.add("John");
		names.add("Mary");
		names.add(56);
		System.out.println(names);
		names.add(2, "Sandra");
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		names.set(1, 67.8);
		System.out.println(names);
		
		for (Object obj : names) {
			System.out.println(obj);
		}
	}

}
