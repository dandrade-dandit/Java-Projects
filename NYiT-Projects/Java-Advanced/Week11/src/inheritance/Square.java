package inheritance;

public class Square extends GeometricFigure {
	Square(int height, int width, String figureType) {
		super(height, width, figureType);
	}

	public double area (int h, int w) {
		return h*w;
	}
	
	public String displaySides() {
		return "four";
	}
	
}
