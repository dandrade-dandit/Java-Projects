import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println(names);
		names.add("John");
		names.add("Mary");
		names.add("Luke");
		System.out.println(names);
		names.add(2, "Sandra");
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		names.set(1, "Mary");
		System.out.println(names);
		
		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
