package practice0422;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String color, double radius){
		super(color, "Circle");
		this.radius = radius;
	}
	
	@Override
	public Double calculateArea() {
		return radius * radius * Math.PI;
	}
	

}
