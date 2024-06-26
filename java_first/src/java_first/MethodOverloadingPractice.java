package java_first;

public class MethodOverloadingPractice {
	
	public double calArea(double radius) {
		return radius * radius * Math.PI;
	}
	
	public double calArea(double width, double height) {
		return width * height;
	}
	
	public double calArea(double base, double height, int num) {
		return base * height / num;
	}

	public static void main(String[] args) {
		MethodOverloadingPractice operator = new MethodOverloadingPractice();
		
		System.out.println("반지름이 5인 원의 넓이 : " + operator.calArea(5));
		System.out.println("가로 4, 세로 7인 직사각형의 넓이 : " + operator.calArea(4, 7));
		System.out.println("밑변 6, 높이 3인 삼각형의 넓이 : " + operator.calArea(6, 3, 2));

	}

}
