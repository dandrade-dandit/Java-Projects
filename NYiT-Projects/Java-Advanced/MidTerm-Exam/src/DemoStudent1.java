/*
 * Student ID: 1269894
 * Student Name: Denis Nascimento
 */

public class DemoStudent1 {

	public static void main(String[] args) {
		Student[] students = new Student[Student.SIZE];
		
		for (int i = 0; i < Student.SIZE; i++) {
			students[i] = new Student(9999, "XYZ", 0.0);
		}
		
		for (Student s : students) {
			System.out.println("Student ID: " + s.getStudentId() + "\tStudent Name: " + s.getName() + "\tStudent Final Marks :" + s.getFinalMarks());
		}

	}

}
