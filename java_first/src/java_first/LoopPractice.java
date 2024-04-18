package java_first;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int inputNum = scan.nextInt();
		
		for(int i =1; i<=inputNum; i++) {
			System.out.printf("%d ",i);
		}
		
		scan.close();
	}

}
