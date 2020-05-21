package advancedinharitance;

public class AnonymousDemo {

	public static void main(String[] args) {
		Animal a = new Animal() {
			public void speak () {
				System.out.println("Animals Speak!!");
			}
		};
		
		Animal a2 = new Animal() {
			public void speak () {
				System.out.println("Animals can speak too!!");
			}
		};
		
		a.speak();
		a2.speak();
		System.out.println(a);
		System.out.println(a2);
	}
	
	

}
