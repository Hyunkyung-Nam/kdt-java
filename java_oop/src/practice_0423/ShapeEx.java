package practice_0423;
import java.util.ArrayList;

public class ShapeEx {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		
		
		shapes.add(new Circle("Red", "Circle", 5.0));
		shapes.add(new Rectangle("Blue", "Rectangle", 6.0, 4.0));
		
		for(Shape shape: shapes) {
			System.out.println("=== " + shape.getType() + " 도형의 정보 ===" );
			System.out.println("도형의 색상 : " + shape.getColor());
			System.out.println("도형의 넓이 : " + shape.calculateArea());
		}
		
	}

}
