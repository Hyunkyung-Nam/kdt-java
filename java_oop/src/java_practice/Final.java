package java_practice;

import java.util.ArrayList;

public class Final {
	
	public static void main(String[] args) {
		final int x = 10; 

		final ArrayList<String> list = new ArrayList<>();
		//x = 20; // 재할당 불가
		
		list.add("Hello");
		
		//list = new ArrayList<>(); // 재할당 불가
		
		//메소드에 final 붙이면 메소드 오버 라이딩이 될 수 없음 
		//클래스에 final을 붙이면 더이상 상속할 수 없음 
	}
	
	
}
