package exceptionHandling;

import javax.swing.JOptionPane;

public class SqrtException {
	public static void main(String[] args)  {
		int num;
		double result;
		String input;
		input = JOptionPane.showInputDialog(null, "Enter a number: ");
		num = Integer.parseInt(input);
		try
	      {
	         if(num < 0)
	            throw(new ArithmeticException());
	         result = Math.sqrt(num);
	         JOptionPane.showMessageDialog(null,"Result is " + result);
	      }
	      catch(ArithmeticException error)
	      {
	         JOptionPane.showMessageDialog(null,
	           "Can't take square root of negative number");
	      }
	}
}
