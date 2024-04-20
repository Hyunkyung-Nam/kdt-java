package java_first;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeException1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요 : ");
		try {
		
			int arrSize = scan.nextInt();
			//배열 크기를 음수로 입력했을 경우 
			if(arrSize < 0) {
				throw new NegativeArraySizeException("배열 크기는 음수가 될 수 없니다.");
			}
			if(arrSize == 0 ) {
				throw new ArithmeticException("배열의 크기는 0이 될 수 없습니다.");
			}
			int[] arr = new int[arrSize];
		
			System.out.println("배열 요소 입력 : ");
			for(int i = 0; i < arrSize; i++) {
				arr[i] = scan.nextInt();
			}
		
			int sum = 0; 
			for(int num :arr) {
				sum += num;
			}
			double avg = (double)sum/arrSize;
		
			System.out.println("평균값은 "+avg+ " 입니다.");
			
		} catch(InputMismatchException e){
			System.out.println("정수를 입력하세요");
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close();
		}

	}

}
