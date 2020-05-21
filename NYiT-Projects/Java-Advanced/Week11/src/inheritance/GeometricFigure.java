package inheritance;

public abstract class GeometricFigure implements SlideObject {
	protected int height;
	protected int width;
	protected String figureType;

	GeometricFigure (int height, int width, String figureType){
		this.figureType = figureType;
		this.height = height;
		this.width = width;
	}
	
	public abstract double area (int h, int w);
}
