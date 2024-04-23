package java_interface;

public interface GameConsole {
	int LEVEL = 1; // public static final int LEVEL = 1;
	void up(); //public abstract 생략 
	void down();
	void left();
	void right();
	
	//default 메소드
	//필요에 따라서 Override할 수 있다. 
	//Override 하지 않는 경우 인터페이스에서 구현된 정의를 사용
	
	default void spacebar() {
		System.out.println("점프하기");
	}
	
	//static 메소드
	//클래스의 인스턴스와 무관하게 직접 호출하여 사용. 
	//인터페이스에 대한 유틸티 함수나 헬퍼함수를 제공 하는데 사용된다. 
	static public void staticPrint() {
		System.out.println("게임 정보 입니다.");
	}
	
}

/* 
 * 추상클래스와 인터페이스의 차이점 
 * 
 * 1. 상속
 * 추상클래스 : 한 클래스는 하나의 추상클래스만 상속가능 
 * 인터페이스 : 한 클래스는 여러개의 인터페이스 상속가능 (다중상속 가능) 
 * 
 * 2. 멤버 변수
 * 추상클래스 : 멤버변수를 가질수 있다.
 * 인터페이스 : 상수만 가질 수 있다. (public static final이 무조건 붙음)
 * 
 * 3. 사용
 * 추상클래스 : 상속 관계에서 공통의 기능이나 상태를 유지할 때 사용 
 * 인터페이스 : 여러클래스에서 공통으로 필요한 기능을 정의할 때 사용
 * 
 * 4. 생성자
 * 추상클래스 : 생성자와 초기화 가능
 * 인터페이스 : 생성자와 초기화 불가능
 * 
 * 5. 구성요소
 * 추상클래스 : 추상메서드, 일반메서드, 생성자, 멤버변수
 * 인터페이스 : 추상메서드, 상수, java8이상부터는 default 메소드, static메소드 사용 가능 
 * 
 * 공통점
 * - 하위 클래스에서 특정한 행동을 강제하기 위해 사용(추상메서드 무조건 구현해야하니까)
 * 
 * */
