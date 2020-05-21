import javax.swing.JOptionPane;

public class NestedIfDemos {
	public static void main(String[] args) {
		int a, b, c;
		String str;
		
		JOptionPane.showMessageDialog(null, "Enter three numbers: ");
		
		str = JOptionPane.showInputDialog(null, "Enter First number; ");
		a = Integer.parseInt(str);
		str = JOptionPane.showInputDialog(null, "Enter Second number; ");
		b = Integer.parseInt(str);
		str = JOptionPane.showInputDialog(null, "Enter Third number; ");
		c = Integer.parseInt(str);
		
		if (a > b) {
			if (a > c) {
				JOptionPane.showMessageDialog(null, a + " is the greatest.");
			} 
			else {
				JOptionPane.showMessageDialog(null, c + " is the greatest.");
			}
		} 
		else if (b > c) {
			JOptionPane.showMessageDialog(null, b + " is the greatest.");
		} 
		else {
			JOptionPane.showMessageDialog(null, c + " is the greatest.");
		}
		
	}

}
