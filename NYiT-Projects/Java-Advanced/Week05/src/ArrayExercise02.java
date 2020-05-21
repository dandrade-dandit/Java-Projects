import java.util.Scanner;

public class ArrayExercise02 {

	public static void main(String[] args) {
		double[] scores = new double[10];
		double score;
		double total=0, average;
		final int QUIT=999;
		final int MAX=10;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter quiz score or " + QUIT + " to exit.\r");
		score=sc.nextDouble();
		sc.hasNextLine();
		while (score != QUIT) {
			scores[count]=score;
			total+=scores[count];
			count++;
			if (count==MAX) {
				score=QUIT;
			} else {
				System.out.println ("Enter quiz score or " + QUIT + " to exit.\r");
				score=sc.nextDouble();
				sc.hasNextLine();
			}
		}	
		if (count == 0) {
			System.out.println("\nNo quiz score was informed.");
		} else {
			average = total / count;
			
			System.out.println("The quiz socres are: ");
			for(int i = 0; i < count; i++) {
				System.out.print(scores[i] + "\t");
			}
			
			System.out.println("\nThe average is :" + average);
		}
		sc.close();
	}

}
