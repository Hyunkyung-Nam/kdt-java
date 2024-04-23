package java_generic;

import java.util.ArrayList;

//extends : ~을 상속하는 
//super : ~을 상속하는 

public class MethodEx {
	
	//타입파라미터를 사용하는 메서드 :데이터 타입을 매개변수처럼 다루게 해준다. 
	
	public <T> void print(T value) {
		System.out.println(value);
	}
	
	//리턴이 있는 제너릭 메소드 
	public <T> T returnTypeMethod(T[] arr) {
		return  arr[0];
	}
	
	//extends 키워드 사용
	//와일드 카드가 읽기 전용으로 주로 사용 ('? extends T')
	public <T extends Number > double sum(T[] arr) {
		double sum = 0.0;
		for(T num: arr) {
			sum += num.doubleValue();
		}
		return sum;
	}
	
	//와일드카드는 앞에 안써도된다. 
	public void wildList(ArrayList<? extends Number> list ) {
		//list.add(1); //불가능
		//읽기 전용이라 더이상 쓸수 없다.
	}

	//	T extends ? 는 문법적으로 틀린거
	// 와일드카드는 앞에만 적을 수 있다

	
	//super 키워드 사용 
	//쓰기 전용으로 주요 사용 
	public <T> void addList(ArrayList<? super T> list, T value) {
		list.add(value);
	}
	

	public static void main(String[] args) {
		MethodEx example = new MethodEx();
		
		//타입 파라미터 사용 메소드
		example.print(12341234);
		example.print("Hello World");
		
		//리턴타입이 있는 메소드
		Integer[] ints ={1,2,3,4,5};
		Double[] doubs = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		System.out.println(example.returnTypeMethod(ints));
		System.out.println(example.returnTypeMethod(doubs));
		
		//extends키워드
		System.out.println(example.sum(doubs));
		System.out.println(example.sum(ints));
		
		//super키워드 
		ArrayList<Number> numList = new ArrayList<>();
		example.addList(numList, 2);
		example.addList(numList, 3.14);
		
		//와일드 카드 주의사항
		// 1. 복잡성 : 와일드 카드를 과도하게 사용하면 복잡성이 증가하여, 협업에 적합하지 않음
		// 2. 제한된 작업 : '? extends T' 같은 경우 새로운 요소 추가 불가
	}
	
	

}
