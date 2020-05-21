package inheritance;

public class AnimalDemo {

	public static void main(String[] args) {
		Cow c = new Cow();
		c.speak();
		c.display();
		
		Dog d =  new Dog();
		d.speak();
		d.display();
		
		Snake s = new Snake();
		s.speak();
		s.display();
	}

}
