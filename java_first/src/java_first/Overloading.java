package java_first;

public class Overloading {
	//메소드 오버로딩
	
	public int add (int num1, int num2) {
		return num1 + num2;
	}
	public double add (double num1, double num2) {
		return num1 + num2;
	}
	public int add (int num1, int  num2, int num3) {
		return num1 + num2 + num3;
	}
	

	public static void main(String[] args) {

		//매서드 사용하기 위해 인스턴스 생성 
		Overloading calc = new Overloading();
		
		System.out.println("10 + 20 = " + calc.add(10, 20));
		System.out.println("2.4 + 2.4 = " + calc.add(2.4, 2.4));
		System.out.println("10 + 20 + 30 = " + calc.add(10, 20,30));
	}

}
