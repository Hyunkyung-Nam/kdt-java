package wrapper;

public class Wrapper {

	public static void main(String[] args) {
		//오토 박싱 
		// 기본데이터 타입을 Wrapper 클래스 객체로 자동 변환 
		//Integer는 class라 new Interger(5)이렇게 해야하는데 이걸 자동으로 해주는거
		Integer integerValue = 5; //이게 auto-boxing
		Integer integerValue2 = Integer.valueOf(5); //위아래 같은 의미 
		
		//오토언박싱
		int intValue = integerValue; //Wrapper 클래스객체를 기본데이터타입으로 자동 변환 
		
		Integer parserInt = Integer.parseInt("12345"); //문자형 데이터를 숫자형으로 바꾸는 것 
		System.out.println(parserInt);
		
		Integer maxInt = Integer.max(10, 30);
		System.out.println(maxInt);
		
		Integer max = Integer.MAX_VALUE;
		System.out.println(max);
	}

}
