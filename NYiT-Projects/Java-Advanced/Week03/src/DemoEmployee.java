
public class DemoEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(9433678, "Denis");
		
		System.out.println("The employee details are: ");
		e1.display();
		e2.display();
		
	}
}
