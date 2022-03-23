package factory;

public class Main {

	public static void main(String[] args) {
		
		IShape circle = ShapeFactory.getShape("circle");
		circle.draw();
		
		IShape square = ShapeFactory.getShape("square");
		square.draw();
		
		IShape poly = ShapeFactory.getShape("poly");
		poly.draw();

	}

}
