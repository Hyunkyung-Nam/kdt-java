package java_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<PracticeRect> rects = new ArrayList<>();
		
		while(true) {
			System.out.println("사각형의 가로 세로를 띄어쓰기로 입력해주세요");
			
			int width = scan.nextInt();
			int height = scan.nextInt();
			
			if(width == 0 && height == 0 ) {
				break;
			}
			PracticeRect rect = new PracticeRect(width);
			rect.setHeight(height);
			
			rects.add(rect);
		}
		
		for(PracticeRect rect:rects) {
			System.out.println("가로길이는 : "+rect.getWidth());
			System.out.println("세로길이는 : "+rect.getHeight());
			System.out.println("넓이는 : "+rect.getArea());
			System.out.println("-------------------------------");
		}
		System.out.println("사각형의 개수는 : " + PracticeRect.getCount());
		scan.close();
		
		//static 사용 예제
		int mul = MathMultiply.square(6);
		System.out.println(mul);
	}

}
