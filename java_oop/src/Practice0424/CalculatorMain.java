package Practice0424;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator<Integer> calcInt = new Calculator(2,3);
		Calculator<Double> calcDoub = new Calculator(3.4,4.5);
		
		System.out.println("2 + 3 = " + calcInt.add());
		System.out.println("3.4 + 4.5 = " + calcDoub.add());
	}

}
