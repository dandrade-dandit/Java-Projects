import javax.swing.JOptionPane;

public class Program2 {
	public static void main(String[] args) {
		String str1, str2;
		int id;
		double salary;
		
		str1  = JOptionPane.showInputDialog(null, "Enter your name:", "Input Dialog Box", JOptionPane.WARNING_MESSAGE);
		str2 = JOptionPane.showInputDialog(null, "Enter your ID:");
		id = Integer.parseInt(str2);
		salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Salary:"));
		
		JOptionPane.showMessageDialog(null, "The name is " + str1 + "\nThe ID is " + id + ".\nThe Salary is: " + salary);
		
		//JOptionPane.showMessageDialog(null, JOptionPane.showInputDialog(null, "Enter your ID:"));
		
		//JOptionPane.showMessageDialog(null, "The name is " + JOptionPane.showInputDialog(null, "Enter your name:") + "\nThe ID is " + Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your ID:")) + ".\nThe Salary is: " + Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Salary:")));
	}

}
