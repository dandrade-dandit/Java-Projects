
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		
		for (int i = 0; i < emps.length; i++)
		{
			emps[i] = new Employee((101+i), 4000.0);
		}

		System.out.println("The Employee details are: ");
		
//		for (int i = 0; i < emps.length; i++)
//		{
//			System.out.println("Employee ID: " + emps[i].getEmpNum() + " Salary: " + emps[i].getSal());
//		}
//		
		for (Employee emp : emps) {
			System.out.println("Employee ID: " + emp.getEmpNum() + " Salary: " + emp.getSal());
		}
	}

}
