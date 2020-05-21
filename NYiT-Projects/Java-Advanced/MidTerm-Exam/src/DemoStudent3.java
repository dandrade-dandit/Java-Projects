import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Student ID: 1269894
 * Student Name: Denis Nascimento
 */

public class DemoStudent3 {

	public static void main(String[] args) {
		int studentId, count=0;
		String selection, studentName;
		double finalMarks;
		Student[] students = new Student[Student.SIZE];
		boolean isYes=true;
		Scanner sc = new Scanner(System.in);
		
		selection = JOptionPane.showInputDialog(null, "Do you want to Add objects (Press A) or Quit (Press Q)??");
		if (selection.charAt(0) == 'q' || selection.charAt(0) == 'Q') isYes = false;
		
		while (isYes) {
			if (count >= Student.SIZE) {
				System.out.println("Sorry -  array is full! -- cannot add an object.");
				break;
			} else {
				System.out.print("Enter the student ID: ");
				studentId = sc.nextInt();
				sc.nextLine();
				if (checkId (students, count, studentId) && count >= 1) {
					System.out.println("Sorry -- ID number already exists.");
					selection = JOptionPane.showInputDialog(null, "Do you want to Add objects (Press A) or Quit (Press Q)??");
					if (selection.charAt(0) == 'q' || selection.charAt(0) == 'Q') isYes = false;
					continue;
				}
				System.out.print("Enter the student name: ");
				studentName = sc.nextLine();
				System.out.print("Enter the final marks: ");
				finalMarks = sc.nextDouble();
				sc.nextLine();
				
				students[count] = new Student(studentId, studentName, finalMarks);
			}

			count++;
			selection = JOptionPane.showInputDialog(null, "Do you want to Add objects (Press A) or Quit (Press Q)??");
			if (selection.charAt(0) == 'q' || selection.charAt(0) == 'Q') isYes = false;
		}

		if (count == 0) {
			System.out.println("No Information to display!");
		} else if (count == 1) {
			display(students, count);
		} else {
			String orderType;
			orderType = JOptionPane.showInputDialog(null, "Do you want to sort objects by ID (Press I) or by Name (Press N)??");
			display_sorted(students, count, orderType);
		}
		sc.close();
	}
	
	private static void display(Student[] students, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Student ID: " + students[i].getStudentId() + "\tStudent Name: " + students[i].getName() + "\tStudent Final Marks :" + students[i].getFinalMarks());
		}
	}
	
	private static void display_sorted(Student[] students, int count, String orderType) {
		if (orderType.charAt(0) == 'i' || orderType.charAt(0) == 'I') {
			bubbleSortPurchagesById(students, count-1);
		} else if (orderType.charAt(0) == 'n' || orderType.charAt(0) == 'N') {
			bubbleSortStudentssByName(students, count-1);
		} else {
			System.out.println("Invalid Option -- Ordering by Name.");
			bubbleSortStudentssByName(students, count-1);
		}
			
		for (int i = 0; i < count; i++) {
			System.out.println("Student ID: " + students[i].getStudentId() + "\tStudent Name: " + students[i].getName() + "\tStudent Final Marks :" + students[i].getFinalMarks());
		}
	}
	
	private static void bubbleSortStudentssByName (Student[] students, int count) {
		for (int outer = count; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {
				if (students[inner].getName().compareTo(students[inner+1].getName()) >= 1) {  
					Student  temp;
					temp = students[inner];
					students[inner] = students[inner+1];
					students[inner+1] = temp;
				}
			}
		}
	}
	
	private static void bubbleSortPurchagesById (Student[] students, int count) {
		for (int outer = count; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {
				if (students[inner].getStudentId() > students[inner+1].getStudentId()) {  
					Student  temp;
					temp = students[inner];
					students[inner] = students[inner+1];
					students[inner+1] = temp;
				}
			}
		}
	}
	
	private static boolean checkId (Student[] students, int count, int key) {
		boolean b = false;
		for (int i = 0; i < count; i++) {
			if (students[i].getStudentId() == key) {
				b = true;
				break;
			}
		}
		return b;
	}

}
