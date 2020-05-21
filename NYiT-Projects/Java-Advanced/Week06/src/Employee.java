
public class Employee {
	private String name;
	private double salary;
	private int empId;
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getEmpId() {
		return empId;
	}

	public Employee(String name, double salary, int empId) {
		super();
		this.name = name;
		this.salary = salary;
		this.empId = empId;
	}
	
	public Employee () {
		this("ABC",0,111);
	}

}
