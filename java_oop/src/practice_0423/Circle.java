package practice_0423;

public class Circle extends Shape{
	private double radius;

	public Circle(String color, String type, double radius) {
		super(color, type);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	
	
	

}
