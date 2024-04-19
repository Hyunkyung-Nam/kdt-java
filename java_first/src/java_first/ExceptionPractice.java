package java_first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {
	static Scanner scan ;
	public static int inputArr() {
		scan = new Scanner(System.in);
		int input = 0;
		try {
			System.out.println("배열의 크기를 입력하세요");
			input = scan.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		}
		
		return input;
	}

	public static void main(String[] args) {
		int inputNum = 0;
		int[] arr = {1,2,3,4,5};
		int sum = 0; 
			
		while(true) {
			inputNum = inputArr();
			if(inputNum != 0 ) {
				break;
			}else if (inputNum == 0) {
				System.out.println("0 이상의 숫자를 입력하세요");
			}
		}
		
		try {
			for(int i = 0; i < inputNum; i++) {
				sum += arr[inputNum];
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
		System.out.print("평균 : " +  (double)sum/inputNum);
		
		scan.close();
	}
}
