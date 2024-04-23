package Generic;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//제네릭 실습 1
		
		ArrayList<Pair<?,?>> pairs = new ArrayList<>();
		Pair<String, Number> pair1 = new Pair<String, Number>("One",1);
		Pair<Number, String> pair2 = new Pair<Number, String>(2, "Two");
		
		pairs.add(pair1);
		pairs.add(pair2);
		
		System.out.println("========제너릭 실습1========");
		for(Pair<?, ?> pair:pairs) {
			System.out.println("Key : " + pair.getKey() + ", Value : " + pair.getValue());
		}
		System.out.println("=========================\n");
		
		//제네릭 실습 2
		Calculator<Integer> integerCal = new Calculator<Integer>(10,5);
		Calculator<Double> doubleCal = new Calculator<Double>(2.22222,3.44444);
		
		System.out.println("========제너릭 실습2========");
		System.out.println("Integer Sum:"+ integerCal.add());
		System.out.println("Double Sum:"+ doubleCal.add());
		System.out.println("=========================\n");
	}

}
