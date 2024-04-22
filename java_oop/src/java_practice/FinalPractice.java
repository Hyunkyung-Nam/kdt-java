package java_practice;

import java.util.Scanner;

public class FinalPractice {


	public static void main(String[] args) {
		
		System.out.print("원의 반지름을 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		
		double inputRadius = scan.nextDouble();
		
		Circle circle = new Circle(inputRadius);
		
		System.out.println("원의 반지름 : " + circle.getRadius());
		System.out.println("원의 넓이 : " + circle.calculateArea());
		
		scan.close();
	}

}
