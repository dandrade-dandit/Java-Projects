
public class RaceHorse extends Horse {
	private int numRaces;

	public int getNumRaces() {
		return numRaces;
	}

	public void setNumRaces(int numRaces) {
		this.numRaces = numRaces;
	}
	
	@Override
	public void display () {
		super.display();
		System.out.print("\tRace # is: " + numRaces);
	}
	
}
