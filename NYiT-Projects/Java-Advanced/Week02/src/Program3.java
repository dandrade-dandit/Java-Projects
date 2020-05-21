import javax.swing.JOptionPane;

public class Program3 {
	public static void main(String[] args) {
		int selection;
		
		selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null, selection);
	}

}
