package java_first;
import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		//조건문 
		Scanner scan = new Scanner(System.in);
//		System.out.println("수를 입력하세요");
//		int num = scan.nextInt();
		
		//if-else문
//		if(num % 3 == 0) { //3의 배
//			System.out.println("3의 배수입니다");
//		}else {
//			System.out.println("3의배수가 아닙니다");
//		}

		
		//switch문
//		switch(num%3) {
//			case 0:
//				System.out.println("3의 배수입니다");
//				break;
//			default :
//			System.out.println("3의 배수가 아닙니다");
//		}
		
		//문자열
		System.out.println("이름을 입력하세요");
		String name = scan.nextLine(); // enter 이전까지 문자열 읽기
		
		if(name.equals("홍길동")) {
			System.out.println("홍길동님 환영합니다");
		} else {
			System.out.printf("%s님 환영합니다.",name).println();
		}
			
		scan.close();
		
	}

}
