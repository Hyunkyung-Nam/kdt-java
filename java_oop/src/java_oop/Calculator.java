package java_oop;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public double divide(int num1, int num2) {
		if( num2 == 0 ) {
			//매서드에 전달된 인자가 잘못되었을 때 하는 오류 처리 
			throw new IllegalArgumentException("오류");
		}
		return (double)num1/num2;
	}
	
}
