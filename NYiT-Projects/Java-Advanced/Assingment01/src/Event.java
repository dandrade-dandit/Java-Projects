
public class Event {
	public static final int CUTOFF_VALUE_LARGE_EVENT = 50;
	public static final int PRICE_PER_GUEST = 35;
	
	private String eventNumber;
	private int qtdGuests;
	private int price;
	
	public void setEventNumber(String contractNumber) {
		this.eventNumber = contractNumber;
	}
	public void setGuests(int qtdGuests) {
		this.qtdGuests = qtdGuests;
		price = this.qtdGuests * PRICE_PER_GUEST;
	}

	
	public String getEventNumber() {
		return eventNumber;
	}
	public int getQtdGuests() {
		return qtdGuests;
	}
	public int getPrice() {
		return price;
	}

	Event (String setGuests,int qtdGuests) {
		setEventNumber(setGuests);
		setGuests(qtdGuests);
	}
	
	Event() {
		this ("A000", 0);
	}
}
