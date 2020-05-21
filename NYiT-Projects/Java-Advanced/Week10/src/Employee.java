
public class Employee {
	private int id;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display () {
		System.out.print("\nID is: " + id + "\tSalary is: " + salary);
	}
	
}
