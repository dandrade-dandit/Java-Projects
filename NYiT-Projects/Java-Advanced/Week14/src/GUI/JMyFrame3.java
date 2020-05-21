package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JMyFrame3 extends JFrame implements ItemListener {
	JCheckBox coffee = new JCheckBox("Coffee", false);
	JCheckBox tea = new JCheckBox("Tea", false);
	JCheckBox milk = new JCheckBox("Milk", false);
	JLabel answer = new JLabel("");
	
	public JMyFrame3 () {
		super("CheckBox Demo");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel heading = new JLabel("This frame has many checkboxes.");
		heading.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel label = new JLabel("What would you like to have?");
		label.setFont(new Font("Arial", Font.BOLD, 16));
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(coffee);
		group.add(tea);
		group.add(milk);
		
		add(heading);
		add(label);
		add(coffee);
		add(milk);
		add(tea);
		add(answer);
		
		coffee.addItemListener(this);
		tea.addItemListener(this);
		milk.addItemListener(this);

	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
        String greeting = "";
        Object source = e.getSource();

		if (source == coffee && coffee.isSelected()) {
			greeting = "You selected coffee.";
		} else if (source == milk && milk.isSelected()) {
			greeting = "You selected milk.";
		} else if (source == tea && tea.isSelected()) {
			greeting = "You selected tea.";
		} else {
			 greeting = "You did not select nothing!";
		}
		
		answer.setText(greeting);
	}

}
