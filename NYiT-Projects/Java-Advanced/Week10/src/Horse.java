
public class Horse {
	protected String name;
	protected String color;
	protected int birthYear;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void display() {
		System.out.print("\nName is: " + name + "\tColor is: " + color + "\tBirth Year: " + birthYear);
	}
}
