package factory;

public abstract class ShapeFactory {
	
	public static IShape getShape(String shapeType) {
		switch (shapeType) {
		case "circle":
			return new Circle();
			
		case "square":
			return new Square();
			
		case "triangle":
			return new Triangle();

		default:
			return null;
		}
	}
}
