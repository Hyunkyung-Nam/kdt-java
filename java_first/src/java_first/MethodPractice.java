package java_first;

import java.util.Scanner;

public class MethodPractice {
	
	public double add (double inputNum1, double inputNum2) {
		return inputNum1 + inputNum2;
	}
	public double sub (double inputNum1, double inputNum2) {
		return inputNum1 - inputNum2;
	}
	public double mul (double inputNum1, double inputNum2) {
		return inputNum1 * inputNum2;
	}
	public double div (double inputNum1, double inputNum2) {
		return inputNum1 / inputNum2;
	}

	public static void main(String[] args) {
		MethodPractice operator = new MethodPractice();
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 두개를 입력하세요");
		
		double inputNum1 = scan.nextInt();
		double inputNum2 = scan.nextInt();
		
		System.out.println("덧셈 결과 : " + operator.add(inputNum1, inputNum2));
		System.out.println("뺄셈 결과 : " + operator.sub(inputNum1, inputNum2));
		System.out.println("나눗셈 결과 : " + operator.div(inputNum1, inputNum2));
		System.out.println("곱셈 결과 : " + operator.mul(inputNum1, inputNum2));
		
		scan.close();
		

	}

}
