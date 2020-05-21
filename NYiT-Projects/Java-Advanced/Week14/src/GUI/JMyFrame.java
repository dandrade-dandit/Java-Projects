package GUI;

import java.awt.*;
import javax.swing.*;

public class JMyFrame extends JFrame {

	public JMyFrame () {
		super("My Frame");
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel heading = new JLabel("This frame has many headings.");
		heading.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel name = new JLabel("Enter your name:");
		JTextField nameField = new JTextField(12);
		JButton button = new JButton("Click to continue");
		setLayout(new FlowLayout());
		add(heading);
		add(name);
		add(nameField);
		add(button);
	}
}
