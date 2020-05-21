package inheritance;

public class Triangle extends GeometricFigure {
	
	Triangle(int height, int width, String figureType) {
		super(height, width, figureType);
	}

	public double area (int h, int w) {
		return 0.5*h*w;
	}
	
	public String displaySides() {
		return "three";
	}
}
