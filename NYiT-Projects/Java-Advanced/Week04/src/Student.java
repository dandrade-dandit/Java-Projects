
public class Student {
	private static final int SCHOOL_ID = 12345; //Constant
	private String name;
	private int age;
	
	Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Student (String name) {
		this (name, 999);
	}
	
	Student (int age) {
		this ("ABC", age);
	}
	
	Student () {
		this ("ABC", 999);
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void printStudent () {
		System.out.println("Name is: " + this.name + " - the Age is: " + this.age + " (" + SCHOOL_ID + ").");
	}
	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setName(String name) {
//	this.name = name;
//}
}
