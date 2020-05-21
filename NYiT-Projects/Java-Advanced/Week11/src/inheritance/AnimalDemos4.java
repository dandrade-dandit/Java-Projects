package inheritance;

public class AnimalDemos4 {

	public static void main(String[] args) {
		Animal[] animalref = new Animal[3];
		
		animalref[0] = new Cow();
		animalref[1] = new Dog();
		animalref[2] = new Snake();
		
		for (int i = 0; i < animalref.length; i++) {
			animalref[i].speak();
			animalref[i].display();
		}

	}

}
