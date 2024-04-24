package Practice0424;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class collection {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
		while(true) {
			System.out.print("정수입력 : ");
			int input = scan.nextInt();
			
			if(input == -1) {
				break;
			}
			hashSet.add(input);
		}
		System.out.println("중복제거된 정수 목록 : "+hashSet);
		
		scan.close();
	}

}
