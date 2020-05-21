
public class Employee {
	private int empNum;
	private double sal;
	
	public int getEmpNum() {
		return empNum;
	}

	public double getSal() {
		return sal;
	}

	public Employee (int empNum, double sal) {
		this.empNum = empNum;
		this.sal = sal;
	}
	
	public Employee () {
		this (9999, 0.0);
	}

}
