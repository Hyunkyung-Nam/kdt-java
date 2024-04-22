package Practice0422;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(String color, double width, double height){
		super(color, "Rectangle");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public Double calculateArea() {
		return width * height;
	}
	


}
