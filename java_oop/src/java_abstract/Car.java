package java_abstract;

public class Car extends Vehicle {
	
	public Car(String name) {
		super(name);
	}
	//추상메소드 구현 
	@Override 
	public void start() {
		System.out.println(getName() + "자동차가 출발합니다.");
	}
}
