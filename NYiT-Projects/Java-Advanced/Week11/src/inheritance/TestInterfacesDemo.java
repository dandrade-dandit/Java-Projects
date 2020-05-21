package inheritance;

public class TestInterfacesDemo {

	public static void main(String[] args) {
		TestInterfaces t = new TestInterfaces();
		
		System.out.println("The sum is : " + t.add(5, 3));
		System.out.println("The difference is : " + t.sub(5, 3));
		System.out.println("The product is : " + t.prod(5, 3));
	}
}
