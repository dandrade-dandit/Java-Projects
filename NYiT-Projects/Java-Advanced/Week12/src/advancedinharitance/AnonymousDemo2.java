package advancedinharitance;

public class AnonymousDemo2 {

	public static void main(String[] args) {
		//Effectively final variable.
		String name = "Denis";
		
		Age obj = new Age() {
			public void getAge() {
				System.out.println("The age is : " + age + "\tThe name is: " + name);
			}
			public void display() {
				System.out.println("I am displayed inside Anonymous Inner Class.");
			}
		};
		obj.getAge();
		obj.display();
	}

}
