package java_oop;

public class Car {
	
	//멤버변수(데이터, 변수, 필드)
	private int speed;
	
	//생성자
	public Car(){
		this(1);
	}
	public Car(int speed){
		if(speed > 0) {
			this.speed = speed;
		} 
	}
	
	//메소드
	public void start() {
		System.out.println("Engine Start");
		System.out.println("speed : " + this.speed);
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int setSpeed) {
		if(setSpeed < 0 ) {
			this.speed = Math.abs(setSpeed);
		}
		this.speed = setSpeed;
	}
	
}
