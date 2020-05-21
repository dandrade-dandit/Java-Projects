import java.util.Scanner;

public class EventDemo {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Event e1 = new Event();
		
		String eventNumber = getEventNumFromUser();
		int qtdGuests = getNumGuestsFromUser();
		
		Event e2 = new Event(eventNumber, qtdGuests);
		
		displayDetails(e1);
		displayDetails(e2);
		
		sc.close();
	}
	
	private static String getEventNumFromUser() {
		System.out.print("Enter with The Event Number: ");
		String event = sc.nextLine();		
		return event;
	}
	
	private static int getNumGuestsFromUser() {
		System.out.print("Enter with The Number of Guests: ");
		int guests = sc.nextInt();
		sc.hasNextLine();
		return guests;
	}
	
	private static void displayDetails(Event e) {
		System.out.println("The Event Number: " + e.getEventNumber() + " had " + e.getQtdGuests() + " Guests. The total price of the Event was: " + e.getPrice() + ".");
	}

}
