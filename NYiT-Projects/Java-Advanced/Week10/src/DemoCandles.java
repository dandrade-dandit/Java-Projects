
public class DemoCandles {
	public static void main(String[] args) {
		Candle c = new Candle();
		ScentedCandle sc = new ScentedCandle();
		
		c.setColor("White");
		c.setHeight(10);
		System.out.println("Color is: " + c.color + "\t\tHeight is: " + c.height + "\tPrice: " + c.price);
		
		sc.setColor("Black");
		sc.setHeight(11);
		sc.setScent("Jasmine");
		System.out.println("Color is: " + sc.color + "\t\tHeight is: " + sc.height + "\tPrice: " + sc.price + "\tScent: " + sc.getScent());
	}

}
