
public class Employee {
	
	private int id;
	private String name;
	
	public Employee () {
		id =  1111;
		name = "####";
	}

	public Employee (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display () {
		System.out.println("The ID is :\t" + this.id + "\t| Name is :\t" + this.name);
	}

}
