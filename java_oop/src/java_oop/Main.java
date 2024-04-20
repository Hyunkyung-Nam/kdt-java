package java_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Rectangle> rects = new ArrayList<>();
		
		
		while(true ) {
			System.out.println("사각형의 가로와 세로길이를 띄어쓰기 기준으로 입력해 주세요.");
			int inputWidth = scan.nextInt();
			int inputHeight = scan.nextInt();
			if(inputWidth == 0 && inputHeight ==0) {
				break;
			}
			Rectangle rect = new Rectangle(inputWidth);
			rect.setHeight(inputHeight);
			rects.add(rect);
		}
		
		for(Rectangle rect:rects) {
			System.out.println("가로길이는 : " +rect.getWidth());
			System.out.println("세로길이는 : " +rect.getHeight());
			System.out.println("넓이는 : " + rect.getArea());
			System.out.println("---------------------------");
		}
		scan.close();
		
		
		
		
//		Car hyundai = new Car(30);
//		Car kia = new Car(50);
//		
//		hyundai.start();
//		kia.start();
//		hyundai.setSpeed(20);
//		kia.setSpeed(100);
//		System.out.println(hyundai.getSpeed());
//		
//		System.out.println(kia.getSpeed());

	
		
//		Calculator calc = new Calculator();
//		
//		System.out.println(calc.add(1, 2));
//		System.out.println(calc.sub(1, 2));
//		System.out.println(calc.multiply(1, 2));
//		System.out.println(calc.divide(1, 2));

	}

}
