package inheritance;

public class DemoAnimal2 {

	public static void main(String[] args) {
		Animal a;
		
		a = new Cow();
		a.speak();
		a.display();
		
		a = new Dog();
		a.speak();
		a.display();

		a = new Snake();
		a.speak();
		a.display();
	}

}
