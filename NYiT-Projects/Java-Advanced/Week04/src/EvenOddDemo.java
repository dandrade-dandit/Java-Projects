import javax.swing.JOptionPane;

public class EvenOddDemo {

	public static void main(String[] args) {
		int num;
		String str;
		
		str = JOptionPane.showInputDialog(null, "Enter the number; ");
		num = Integer.parseInt(str);

		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, num + " is even.");
		} 
		else {
			JOptionPane.showMessageDialog(null, num + " is odd.");
		}

	}

}
