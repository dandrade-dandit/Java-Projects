package inheritance;

public class UseGeometric {
	public static void main(String[] args) {
		GeometricFigure[] geoFigureRef = new GeometricFigure[2];
		
		geoFigureRef[0] = new Square(3,3,"Square");
		geoFigureRef[1] = new Triangle(4,4,"Triangle");
		
		for (int i = 0; i < geoFigureRef.length; i++) {
			System.out.println("The area of " + geoFigureRef[i].figureType + " is : " +
		                         geoFigureRef[i].area(geoFigureRef[i].height, geoFigureRef[i].width) + 
		                         " and it has " + geoFigureRef[i].displaySides() + " sides.");
		}
	}
}
