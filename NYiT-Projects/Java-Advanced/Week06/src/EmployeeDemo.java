
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		
		emps[0] = new Employee("John", 1575.5, 2222);
		emps[1] = new Employee("Mary", 2275, 1111);
		emps[2] = new Employee("Alvisa", 3000.9, 4444);
		emps[3] = new Employee("Sandra", 1000, 3333);
		
		
		System.out.println("Before Sorting:");
		display(emps);
		

		//Sort by ID
		bubbleSortById(emps);
		System.out.println("After Sorting by ID:");
		display(emps);
		
		//Sort by Salary
		bubbleSortBySalary(emps);
		System.out.println("After Sorting by Salary:");
		display(emps);
		
		//Sort by Name
		bubbleSortByName(emps);
		System.out.println("After Sorting by Name:");
		display(emps);
	}
	
	private static void display(Employee[] arr) {
		for (Employee e: arr) {
			System.out.println("Name " + e.getName() + "\tSalary: " + e.getSalary() + "\tID: " + e.getEmpId());
		}
	}
	
	public static void bubbleSortById(Employee[] array) {
		for (int i=0; i<array.length-1;i++) {
			for (int j=0; j < array.length-i-1; j++) {
				if (array[j].getEmpId() > array[j+1].getEmpId()) {
					Employee temp;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public static void bubbleSortBySalary(Employee[] array) {
		for (int i=0; i<array.length-1;i++) {
			for (int j=0; j < array.length-i-1; j++) {
				if (array[j].getSalary() > array[j+1].getSalary()) {
					Employee temp;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public static void bubbleSortByName(Employee[] array) {
		for (int i=0; i<array.length-1;i++) {
			for (int j=0; j < array.length-i-1; j++) {
				if (array[j].getName().compareTo(array[j+1].getName()) > 0) {
					Employee temp;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
