
public class Student {
	
	private int id;
	private String name;
	private Double marks1, marks2;
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Double getMarks() {
//		return marks;
//	}
//	public void setMarks(Double marks) {
//		this.marks = marks;
//	}
	
	
	public Student () {
		this.id = 11111;
		this.name = "####";
		this.marks1 = this.marks2 = 0.0;
	}
	
	public Student (int id, String name, double marks1, double marks2) {
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	
	public void calculateAverage () {
		double avg = (marks1 + marks2)/ 2;
		printDetails(avg);
	}

	private void printDetails(double avg) {
		System.out.println("The Student: " + name + "\t | ID: " + fixedLengthString(id, 5) + " got the Average Mark of : " + avg);
	}
	
	private static String fixedLengthString(int string, int length) {
        return String.format("%1$"+length+ "s", string);
    }
}
