/*
 * Student ID: 1269894
 * Student Name: Denis Nascimento
 */

public class Student {
	private int studentId;
	private String name;
	private double finalMarks;
	public static final int SIZE = 5;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFinalMarks() {
		return finalMarks;
	}
	public void setFinalMarks(double finalMarks) {
		this.finalMarks = finalMarks;
	}
	
	Student (int studentId, String name, double finalMarks) {
		this.studentId = studentId;
		this.name =  name;
		this.finalMarks = finalMarks;
	}
}
