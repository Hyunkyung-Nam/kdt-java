package practice_0423;

public abstract class Shape {
	private String color;
	private String type;
	
	//생성자
	public Shape(String color, String type) {
		//기본적으로 모든클래스는 Object클래스를 상속받아서 자동생성시 super();가 나옴
		this.color = color;
		this.type = type;
	}

	//추상메소드
	public abstract double calculateArea();
	
	//일반메소드
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
}
