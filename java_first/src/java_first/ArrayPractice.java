package java_first;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] inputArr = new int[5];
		int sum = 0;
		
		System.out.println("5개의 정수를 입력하세요.");
		for(int i = 0; i < 5 ; i++) {
			inputArr[i] = scan.nextInt();
			sum += inputArr[i];
		}
		
		System.out.println((double)(sum / 5));
		
		scan.close();
		
	}

}
