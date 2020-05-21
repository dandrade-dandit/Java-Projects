import javax.swing.JOptionPane;


public class ArrayExercise01 {

	public static void main(String[] args) {
		String str;
		double[] scores = new double[5];
		double totalScore=0, avgScore=0;
		
 		JOptionPane.showMessageDialog(null, "Enter "+ scores.length + " grades: ");
		
 		
 		for (int i = 0; i < scores.length; i++) {
 			str = JOptionPane.showInputDialog(null, "Enter the " + (i+1) + " grade: ");
 			scores[i] = Double.parseDouble(str);
 			totalScore = totalScore + scores[i];
 		}
		
		
 		avgScore = totalScore /  scores.length;
 		
 		
 		JOptionPane.showMessageDialog(null, "The Average is : " + avgScore);
	}


}
