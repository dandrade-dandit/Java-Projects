import javax.swing.JOptionPane;

public class RecordingSortUser {

	public static void main(String[] args) {
		
		/*
		 * b)	Write an application that instantiates five Recording objects and prompts the user for values for the data fields. 
		 * Then prompt the user to enter which field the Recordings should be sorted by—song title, artist, or playing time. 
		 * Perform the requested sort procedure, and display the Recording objects. Save the file as RecordingSort.java.
		 */
		
		int max = 5, playingTime, count=0;
		String recTitle, artistName;
		Recording[] rec = new Recording[max];
		int selection;
		boolean isYes=true;
		
		selection = JOptionPane.showConfirmDialog(null, "Do you want to inform another Song?", "Make your choice!", JOptionPane.YES_NO_OPTION);
		isYes = (selection ==  JOptionPane.YES_OPTION);
		
		while (isYes) {
			recTitle = JOptionPane.showInputDialog(null, "Enter with The Recording Title: ");
			artistName = JOptionPane.showInputDialog(null, "Enter with The Artist Name: ");
			playingTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter with The Playing Time (in seconds): "));
			
			//Construct the object
			rec[count] = new Recording();
			rec[count].setRecTitle(recTitle);
			rec[count].setArtistName(artistName);
			rec[count].setPlayingTime(playingTime);
			
			count++;
			if (count >= max) break;
			
			selection = JOptionPane.showConfirmDialog(null, "Do you want to inform another Song?", "Make your choice!", JOptionPane.YES_NO_OPTION);
			isYes = (selection ==  JOptionPane.YES_OPTION);
		}
		
		
		if (count == 0) {
			JOptionPane.showMessageDialog(null, "Nothing to show!");
		} else if (count == 1) {
			displayRecordings(rec, 0);
		} else if (count > 1) {
			String returnQuestionPrint = JOptionPane.showInputDialog(null, "Do you want to print the information sorted by Song Title, Artist, or Playing Time?\n[S=Song Title/A=Artist/T=Playing Time]");
			
			if (returnQuestionPrint.charAt(0) == 'S'  || returnQuestionPrint.charAt(0) == 's') {
				displayBySongs(rec, count-1);
			} else if (returnQuestionPrint.charAt(0) == 'A'|| returnQuestionPrint.charAt(0) == 'a') {
				displaybyArtist(rec, count-1);
			} else {
				displayByTime(rec, count-1);
			}
		}

}

	private static void displayByTime(Recording[] rec, int count) {
		bubbleSortPurchagesByTime(rec, count);
		displayRecordings(rec, count);
	}

	private static void displaybyArtist(Recording[] rec, int count) {
		bubbleSortPurchagesByArtist(rec, count);
		displayRecordings(rec, count);
		
	}

	private static void displayBySongs(Recording[] rec, int count) {
		bubbleSortPurchagesBySong(rec, count);
		displayRecordings(rec, count);
	}
	
	private static void bubbleSortPurchagesBySong (Recording[] rec1, int count) {
		for (int outer = count; outer > 0; outer--) {
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
	
	private static void bubbleSortPurchagesByArtist (Recording[] rec1, int count) {
		for (int outer = count; outer > 0; outer--) {
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
	
	private static void bubbleSortPurchagesByTime (Recording[] rec1, int count) {
		for (int outer = count; outer > 0; outer--) {
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
	
	
	public static void displayRecordings (Recording[] rec1, int count) {
		String display="";
		for (int i = 0; i <= count; i++) {
			display += (i+1) + " - The Song Name is : " + rec1[i].getRecTitle() + " and the Artist is :" + rec1[i].getArtistName() + " with time of : " + rec1[i].getPlayingTime() + " (in secodns).\n";
		}
		JOptionPane.showMessageDialog(null, display);
	}
}

