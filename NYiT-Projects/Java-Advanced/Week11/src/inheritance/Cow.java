package inheritance;

public class Cow extends Animal {
	public void speak() {
		System.out.println("Cow says moo moo!");
	}
	
	@Override
	public void display() {
		System.out.println("Its about different cows.");
	}

}
