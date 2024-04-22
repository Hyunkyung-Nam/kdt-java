package Practice0422;

public class PracticeCircle {
	private final double radius;
	private static final double PI = 3.141592;
	
	public PracticeCircle(double radius) {
		this.radius = radius;
	}
	
	public Double calculateArea() {
		return radius * radius * PI;
	}
	
	public void printInfo() {
		System.out.println("원의 반지름 : " + radius);
		System.out.println("원 넓이 : " + calculateArea());
	}
}
