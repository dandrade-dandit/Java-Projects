package inheritance;

public class AnimalDemo3 {

	public static void main(String[] args) {
		Cow c = new Cow();		
		Dog d =  new Dog();
		
		show(c);
		show(d);

	}
	
	public static void show (Animal a) {
		System.out.println("Come one. Come all!!");
		System.out.println("See the Talking Animal!");
		a.speak();
		System.out.println("*************************************                               ");
	}

}
