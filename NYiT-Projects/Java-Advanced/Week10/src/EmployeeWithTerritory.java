
public class EmployeeWithTerritory extends Employee{
	private String territory;

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}
	
	@Override
	public void display () {
		super.display();
		System.out.print("\tTerritory is: " + territory);
	}
}
