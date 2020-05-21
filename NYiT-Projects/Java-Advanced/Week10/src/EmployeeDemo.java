
public class EmployeeDemo {

	public static void main(String[] args) {
		EmployeeWithTerritory customerRep = new EmployeeWithTerritory();
		Employee clerk = new Employee();
		
		boolean result;
		
		result = customerRep instanceof EmployeeWithTerritory;
		System.out.println(result);
		
		result = customerRep instanceof Employee;
		System.out.println(result);
		
		result = clerk instanceof EmployeeWithTerritory;
		System.out.println(result);
		
		result = clerk instanceof Employee;
		System.out.println(result);
		
		//calls parent's version of display()
		clerk.setId(101);
		clerk.setSalary(2000);
		clerk.display();
		
		//calls child's version of display()
		customerRep.setId(201);
		customerRep.setSalary(1000);
		customerRep.setTerritory("North");
		customerRep.display();
	}

}
