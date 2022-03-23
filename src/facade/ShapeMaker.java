package facade;

public class ShapeMaker {
	
	 private Shape circle;
	 private Shape square;
	 
	 public ShapeMaker() {
		 this.circle = new Circle();
		 this.square = new Square();
	 }
	 
	 public void drawCircle() {
		 this.circle.draw();
	 }
	 
	 public void drawSquare() {
		 this.square.draw();
	 }

}
