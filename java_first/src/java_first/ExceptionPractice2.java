package java_first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {

	static Scanner scan ;
	public static int inputSize() {
		scan = new Scanner(System.in);
		int input = 0;
		try {
			System.out.println("배열의 크기를 입력하세요");
			input = scan.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		}
		
		return input;
	}

	public static void main(String[] args) {
		int inputNum = 0;
		ArrayList<Integer> inputArr = new ArrayList<>() ;
		ArrayList<ArrayList<Integer>> dupicatedArr = new ArrayList<ArrayList<Integer>>();
			
		while(true) {
			inputNum = inputSize();
			if(inputNum != 0 ) {
				break;
			}else if (inputNum == 0) {
				System.out.println("0 이상의 숫자를 입력하세요");
			}
			
		}
		System.out.println("배열 요소를 입력하십시오");
		for(int i = 0; i<inputNum; i++) {
			try {
				inputArr.add(scan.nextInt());
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력하세요");
				if(inputArr.size() == 0 ) {
					System.out.printf("현재까지 입력된 요소는 없습니다.\n");
				}else {
					System.out.printf("현재까지 입력된 요소는 %s 입니다.n" ,inputArr);
				}
				
				System.out.printf("%d개 배열 요소를 입력하십시오\n",inputNum-inputArr.size());
				scan = new Scanner(System.in);
				i--;
			}
		}
		inputArr.sort(Comparator.naturalOrder());
		
		ArrayList<Integer> tempArr = new ArrayList<>() ;
		int count = 0;

		while(inputArr.size() > 0) {
			if(inputArr.size()!= 1 && inputArr.get(0) == inputArr.get(1)) {
				tempArr.add(inputArr.get(0));
				count++;
			}else if(count >= 1) {
	
					tempArr.add(inputArr.get(0));
					count = 0;
					
					
					dupicatedArr.add((ArrayList<Integer>)tempArr.clone());
			
					
					tempArr.clear();	
					
			}
			inputArr.remove(0);
		}
		
		
		System.out.println(dupicatedArr);
		
		scan.close();
	}

}
