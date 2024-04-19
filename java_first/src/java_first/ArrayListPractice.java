package java_first;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> inputArr = new ArrayList<>();
		
		while(true) {
			System.out.println("문자를 입력해주세요. : ");
			String input = scan.nextLine();
			if(input.equals("exit")) {
				scan.close();
				break;
			}
			
			inputArr.add(input);
			
		}
		for(String input : inputArr) {
			System.out.println(input);
		}
		
	}

}
