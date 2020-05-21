/*
 * 3.	Write an application for Lambert’s Vacation Rentals. Use separate ButtonGroups to allow a client to select one of three locations, 
 *      the number of bedrooms, and whether meals are included in the rental. Assume that the locations are parkside for $600 per week, 
 *      poolside for $750 per week, or lakeside for $825 per week. 
 *      Assume that the rentals have one, two, or three bedrooms and that each bedroom greater than one adds $75 to the base price. 
 *      Assume that if meals are added, the price is $200 more per rental. Save the file as JVacationRental.java.
 */
package assingment02;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener {
	
	JCheckBox parkside = new JCheckBox("Parkside", false);
	JCheckBox poolside = new JCheckBox("Poolside", false);
	JCheckBox lakeside = new JCheckBox("Lakeside", false);
	
	JCheckBox oneBed = new JCheckBox("1 beedroom", false);
	JCheckBox twoBeds = new JCheckBox("2 beedrooms", false);
	JCheckBox threeBeds = new JCheckBox("3 beedrooms", false);
	
	JCheckBox noMeals = new JCheckBox("No meals", false);
	JCheckBox meals = new JCheckBox("Meals included", false);

	JTextField answer = new JTextField(10);
	
	int finalPrice=0;
	
	public JVacationRental () {
		super("Vacation rentals");
		setSize(800,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
				
		ButtonGroup groupSide = new ButtonGroup();
		groupSide.add(parkside);
		groupSide.add(poolside);
		groupSide.add(lakeside);
		
		ButtonGroup groupBed = new ButtonGroup();
		groupBed.add(oneBed);
		groupBed.add(twoBeds);
		groupBed.add(threeBeds);
		
		ButtonGroup groupMeals = new ButtonGroup();
		groupMeals.add(noMeals);
		groupMeals.add(meals);
		
		add(parkside);
		add(poolside);
		add(lakeside);
		add(oneBed);
		add(twoBeds);
		add(threeBeds);
		add(noMeals);
		add(meals);
		add(answer);
		
		parkside.addItemListener(this);
		poolside.addItemListener(this);
		lakeside.addItemListener(this);
		oneBed.addItemListener(this);
		twoBeds.addItemListener(this);
		threeBeds.addItemListener(this);
		noMeals.addItemListener(this);
		meals.addItemListener(this);
		
	}
	
	/*
	 * 3.	Write an application for Lambertís Vacation Rentals. Use separate ButtonGroups to allow a client to select one of three locations, 
	 * the number of bedrooms, and whether meals are included in the rental. Assume that the locations are parkside for $600 per week, 
	 * poolside for $750 per week, or lakeside for $825 per week. Assume that the rentals have one, two, or three bedrooms and that each
	 * bedroom greater than one adds $75 to the base price. Assume that if meals are added, the price is $200 more per rental. Save the file as JVacationRental.java.
	 */
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		int basePrice=0, addOnBedPrice=0, addOnMeals=0;
        Object source = e.getSource();

        //Set Side
		if (source == parkside || parkside.isSelected()) {
			finalPrice = 600;
		} else if (source == poolside || poolside.isSelected()) {
			finalPrice = 750;
		} else if (source == lakeside || lakeside.isSelected()) {
			finalPrice = 825;
		}
		
		//Set Bed
		if (source == oneBed || oneBed.isSelected()) {
			addOnBedPrice = 0;
		} else if (source == twoBeds || twoBeds.isSelected()) {
			addOnBedPrice = 75;
		} else if (source == threeBeds || threeBeds.isSelected()) {
			addOnBedPrice = 150;
		}
		finalPrice += addOnBedPrice;
		
		//Set Meals
		if (source == noMeals || noMeals.isSelected()) {
			addOnMeals = 0;
		} else if (source == meals || meals.isSelected()) {
			addOnMeals= 200;
		} 
		
		finalPrice += addOnMeals;
		
		answer.setText(Integer.toString(finalPrice));
	}
	
	public static void main(String[] args) {
		JVacationRental myFrame1 = new JVacationRental();
	}

}

