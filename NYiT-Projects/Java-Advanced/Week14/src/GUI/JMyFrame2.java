package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JMyFrame2 extends JFrame implements ActionListener {
	JTextField nameField = new JTextField(12);
	JLabel answer = new JLabel("");
	JCheckBox coffee = new JCheckBox("Coffee", false);
	
	public JMyFrame2 () {
		super("My Frame");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel heading = new JLabel("This frame has many components.");
		heading.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel name = new JLabel("Enter your name:");
		JButton button = new JButton("Click to continue");
		
		setLayout(new FlowLayout());
		add(heading);
		add(name);
		add(nameField);
		add(button);
		add(answer);
		add(coffee);
		
		revalidate();
		
		button.addActionListener(this);
		nameField.addActionListener(this);
		coffee.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name1 = nameField.getText();
		Object source = e.getSource();
		String greeting = "";
		
		if (source == nameField) {
			 greeting = "Hello, " + name1;
		}
		if (source == coffee) {
			greeting = "Hello, " + name1 + ". Do you want some coffee?";
		} else {
			 greeting = "Hi, " + name1;
		}
		
		answer.setText(greeting);
	}

}
