import javax.swing.JOptionPane;

public class RecordingSort {
	
	public static void main(String[] args) {
		
		/*
		 * b)	Write an application that instantiates five Recording objects and prompts the user for values for the data fields. 
		 * Then prompt the user to enter which field the Recordings should be sorted by—song title, artist, or playing time. 
		 * Perform the requested sort procedure, and display the Recording objects. Save the file as RecordingSort.java.
		 */
		
		int max = 5, playingTime;
		String recTitle, artistName;
		Recording[] rec = new Recording[max];
		
		for (int i = 0; i < max; i++) {
			recTitle = JOptionPane.showInputDialog(null, "Enter with The Recording Title: ");
			artistName = JOptionPane.showInputDialog(null, "Enter with The Artist Name: ");
			playingTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter with The Playing Time (in seconds): "));
			
			//Construct the object
			rec[i] = new Recording();
			rec[i].setRecTitle(recTitle);
			rec[i].setArtistName(artistName);
			rec[i].setPlayingTime(playingTime);
		}
		
		String returnQuestionPrint = JOptionPane.showInputDialog(null, "Do you want to print the information sorted by Song Title, Artist, or Playing Time?\n[S=Song Title/A=Artist/T=Playing Time]");
		
		if (returnQuestionPrint.charAt(0) == 'S'  || returnQuestionPrint.charAt(0) == 's') {
			displayBySongs(rec);
		} else if (returnQuestionPrint.charAt(0) == 'A'|| returnQuestionPrint.charAt(0) == 'a') {
			displaybyArtist(rec);
		} else {
			displayByTime(rec);
		}

}

	private static void displayByTime(Recording[] rec) {
		bubbleSortPurchagesByTime(rec);
		displayRecordings(rec);
	}

	private static void displaybyArtist(Recording[] rec) {
		bubbleSortPurchagesByArtist(rec);
		displayRecordings(rec);
		
	}

	private static void displayBySongs(Recording[] rec) {
		bubbleSortPurchagesBySong(rec);
		displayRecordings(rec);
	}
	
	private static void bubbleSortPurchagesBySong (Recording[] rec1) {
		for (int outer = rec1.length -1; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {
				if (rec1[inner].getRecTitle().compareTo(rec1[inner+1].getRecTitle()) >= 1) {  
					Recording  temp;
					temp = rec1[inner];
					rec1[inner] = rec1[inner+1];
					rec1[inner+1] = temp;
				}
			}
		}
	}
	
	private static void bubbleSortPurchagesByArtist (Recording[] rec1) {
		for (int outer = rec1.length -1; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {
				if (rec1[inner].getArtistName().compareTo(rec1[inner+1].getArtistName()) >= 1) {  
					Recording  temp;
					temp = rec1[inner];
					rec1[inner] = rec1[inner+1];
					rec1[inner+1] = temp;
				}
			}
		}
	}
	
	private static void bubbleSortPurchagesByTime (Recording[] rec1) {
		for (int outer = rec1.length -1; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {
				if (rec1[inner].getPlayingTime() > rec1[inner+1].getPlayingTime()) {  
					Recording  temp;
					temp = rec1[inner];
					rec1[inner] = rec1[inner+1];
					rec1[inner+1] = temp;
				}
			}
		}
	}
	
	
	private static void displayRecordings (Recording[] rec1) {
		String display="";
		for (int i = 0; i < rec1.length; i++) {
			display += (i+1) + " - The Song Name is : " + rec1[i].getRecTitle() + " and the Artist is :" + rec1[i].getArtistName() + " with time of : " + rec1[i].getPlayingTime() + " (in secodns).\n";
		}
		JOptionPane.showMessageDialog(null, display);
	}
}
