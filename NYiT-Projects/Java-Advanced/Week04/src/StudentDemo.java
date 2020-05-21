
public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student("John", 44);
		Student s2 = new Student("Denis");
		Student s3 = new Student(40);

//		s.setAge(44);
//		s.setName("Denis Andrade");
		
//		printStudent(s.getName(), s.getAge());
		s.printStudent();
	
		s1.printStudent();
		
		s2.printStudent();
		
		s3.printStudent();
	}
	

}
