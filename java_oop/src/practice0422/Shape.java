package practice0422;

public abstract class Shape {
	private String color;
	private String type;
	
	public Shape(String color, String type){
		this.color = color;
		this.type = type;
		
	}
	
	abstract Double calculateArea();
	
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	
	
	public void printInfo() {
		System.out.printf("=== %s 도형의 정보===\n", getType());
		System.out.printf("도형의 색상 : %s\n", getColor());
		System.out.printf("도형의 넓이 : %f\n\n", calculateArea());
	}
	
}
