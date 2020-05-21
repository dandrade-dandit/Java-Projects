
import java.util.Scanner;

public class DemoStudent {
	
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Scanner input = new Scanner (System.in);
		String name;
		int id;
//		double marks;
		double marks1, marks2;
		
//		System.out.print("Enter the name of the Student 01: ");
//		name = input.nextLine();
//		
//		System.out.print("Enter the ID of the Student 01: ");
//		id = input.nextInt();
//		input.nextLine();
//		
//		System.out.print("Enter the Marks of the Student 01: ");
//		marks = input.nextDouble();
//		input.nextLine();
		
//		s1.setName(name);
//		s1.setId(id);
//		s1.setMarks(marks);
		
		System.out.print("Enter the name of the Student 02: ");
		name = input.nextLine();
		
		System.out.print("Enter the ID of the Student 02: ");
		id = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter the Marks 1 of the Student 02: ");
		marks1 = input.nextDouble();
//		System.out.print("Enter the Marks of the Student 02: ");
//		marks = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter the Marks 2 of the Student 02: ");
		marks2 = input.nextDouble();
		input.nextLine();
		
		Student s2 = new Student(id, name, marks1, marks2);
		
//		s2.setName(name);
//		s2.setId(id);
//		s2.setMarks(marks);
		
		clearConsole();
		System.out.print("Enter the name of the Student 03: ");
		name = input.nextLine();
		
		System.out.print("Enter the ID of the Student 03: ");
		id = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter the Marks 1 of the Student 03: ");
		marks1 = input.nextDouble();
//		System.out.print("Enter the Marks of the Student 03: ");
//		marks = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter the Marks 2 of the Student 03: ");
		marks2 = input.nextDouble();
		input.nextLine();
		
		Student s3 = new Student(id, name, marks1, marks2);
		
//		s3.setName(name);
//		s3.setId(id);
//		s3.setMarks(marks);
		
		System.out.println();
		System.out.println("The details of students are: ");
		
		System.out.print("Student 01 -> | ");
		s1.calculateAverage();
//		System.out.println("Name: " + s1.getName() + "\tID is : " + s1.getId() + "\tMarks are : " + s1.getMarks() + " |");
		
		System.out.print("Student 02 -> | ");
		s2.calculateAverage();
//		System.out.println("Name: " + s2.getName() + "\tID is : " + s2.getId() + "\tMarks are : " + s2.getMarks() + " |");
		
		System.out.print("Student 03 -> | ");
		s3.calculateAverage();
//		System.out.println("Name: " + s3.getName() + "\tID is : " + s3.getId() + "\tMarks are : " + s3.getMarks() + " |");
		
		input.close();
	}

}
