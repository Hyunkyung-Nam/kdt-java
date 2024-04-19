package java_first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		//예외처리 
		
		//숫자를 0으로 나눈 경우 
		try {
			int num1 = 4;
			int num2 = 0;
			System.out.println("num1 / num2 = " + num1/num2);
			
		}catch(ArithmeticException e){
			System.out.println("0으로 나누어 예외 발생");
		}
		System.out.println("여기까지도달하나요");
		
		//인덱스의 범위를 벗어났을 때 
		
		int[] intArr = {1, 2, 3, 4};
		
		
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println(intArr[i] + " ");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위가 벗어났습니다. ");
		}
		
		Scanner scan = new Scanner(System.in);
		
		//입력오류 발생
		
		try {
			System.out.println("정수를 입력하세요");
			int num = scan.nextInt();
			System.out.println("입력된 정수는 " + num);
		}
		catch(InputMismatchException e) {
			System.out.println("입력오류, 정수를 입력하세요");
		}

		//null에 접근하는 경우
		
		try {
			String text = null;
			
			System.out.println(text.length());
		}catch(NullPointerException e) {
			System.out.println("NUll값에 접근할 수 없습니다.");
		}
	}

}
