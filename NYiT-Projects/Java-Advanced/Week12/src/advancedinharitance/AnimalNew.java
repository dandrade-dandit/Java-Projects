package advancedinharitance;

public abstract class AnimalNew {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void speak();
	
	@Override
	public String toString() {
		return name;
	}

}
