package Practice0422;

import java.util.ArrayList;

public class ShapeEx {

	public static void main(String[] args) {
		
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		Circle redCircle = new Circle("Red", 5);
		shapes.add(redCircle);
		
		Rectangle BlueRect = new Rectangle("Blue", 6,4);
		shapes.add(BlueRect);
		
		for(Shape shape : shapes ) {
			shape.printInfo();
		}
		
	}

}
