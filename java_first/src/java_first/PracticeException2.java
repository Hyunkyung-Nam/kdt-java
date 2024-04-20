package java_first;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class PracticeException2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("배열의 크기를 입력하세요 : ");
		
		int input = scan.nextInt();
		if(input < 0 ) {
			throw new NegativeArraySizeException();
		}
		
		//사용자가 입력한 배열 요소 추가
		ArrayList<Integer> list = new ArrayList<>();
		//중복된 숫자 배열
		ArrayList<Integer> duplicate = new ArrayList<>();
		
		System.out.println("배열의 요소를 입력하세요 : ");
		for(int i = 0; i <input; i++) {
			int input2 = scan.nextInt();
			
			if(list.contains(input2) && !duplicate.contains(input2)) {
				duplicate.add(input2);
			}
			list.add(input2);
		}
		
		System.out.println("중복된 숫자 서브 배열 : ");
		
		if(!duplicate.isEmpty()) {
			for(Integer dup : duplicate) {
				ArrayList<Integer> dupList = new ArrayList<>();
				
				for(int count = 0; count < list.stream().filter(x -> x.equals(dup)).count(); count++) {
					dupList.add(dup);
				}
				System.out.println(dupList);
			}
			
		}else {
			System.out.println("No duplicates found.");
		}
		}catch(InputMismatchException e) {
			System.out.println("오류발생 : 배열 크기는 정수로 입력하세요.");
			
		}catch(NegativeArraySizeException e) {
			System.out.println("오류발생 : 배열 크기는 양의 정수로 입력하세요.");
		}finally {
			scan.close();
		}

	}

}
