package java_first;

public class BasicType {

	public static void main(String[] args) {
		int number = 10; // 정수형 변수
		double pi = 3.141592; // 실수형 변수 
		boolean isActive = false; //논리형 변수
		char initial = 'a'; // 문자형 변수  홑따옴표 사용 
		
		System.out.println("Number " + number);
		System.out.println("PI " + pi);
		System.out.println("Is Active ? " + isActive);
		System.out.println("Initial " + initial);
		
		System.out.printf("%d * %d = %d",10,2,10*2); 
		//%d : 정수
		//%f : 실수 (%.숫자F : 소수점을 숫자만큼 나타냄 )
		// ex) %.2f : 소수점 둘째자리까지 
		//%s : 문자열
		//%c : 문자
		//%b : boolean
		
	}

}
