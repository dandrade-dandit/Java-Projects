package GUI;

import java.awt.*;
import javax.swing.*;

public class MyFrame {

	public static void main(String[] args) {
		//JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame aFrame1 = new JFrame();
		JFrame aFrame2 = new JFrame("My Second Frame");
		
		FlowLayout flow = new FlowLayout();
		
		aFrame1.setTitle("My Fisrt Frame");
		
		aFrame1.setSize(350, 200);
		aFrame2.setBounds(250,250,400,200);
		
		aFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aFrame1.setVisible(true);
		aFrame2.setVisible(true);
		
		JLabel label1 = new JLabel("Good Morning!");  
		label1.setFont(new Font("Arial", Font.BOLD, 16));
		aFrame1.add(label1);
		
		JLabel label2 = new JLabel("Have a nice day!!");
		label2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		aFrame1.add(label2);
		aFrame1.setLayout(flow);
		
		aFrame1.revalidate();
		
		aFrame2.add(new JLabel("Hello World!"));
		JTextField field1 = new JTextField(16);
		JButton button = new JButton("Click me!!");
		JCheckBox coffee = new JCheckBox("Coffee", false);
		JCheckBox tea = new JCheckBox("Tea", false);
		JCheckBox milk = new JCheckBox("Milk", true);
		ButtonGroup group = new ButtonGroup();
		
		aFrame2.add(field1);
		aFrame2.add(button);
		aFrame2.add(coffee);
		aFrame2.add(tea);
		aFrame2.add(milk);
		group.add(coffee);
		group.add(tea);
		group.add(milk);
		aFrame2.setLayout(new FlowLayout());
		aFrame2.revalidate();
	}
}