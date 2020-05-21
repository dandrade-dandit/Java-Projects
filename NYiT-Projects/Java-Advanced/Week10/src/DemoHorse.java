
public class DemoHorse {

	public static void main(String[] args) {
		Horse h = new Horse();
		RaceHorse rh = new RaceHorse();
		
		h.setName("Pegasso");
		h.setColor("Black");
		h.setBirthYear(2010);
		h.display();
		
		rh.setName("Pintado");
		rh.setColor("Brown");
		rh.setBirthYear(2012);
		rh.setNumRaces(20);
		rh.display();
	}

}
