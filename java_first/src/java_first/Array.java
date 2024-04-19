package java_first;

import java.util.Arrays;

public class Array {
	
	//가변적 매개변수  
	public static int addNumbers(int... nums) { //가변변수는 항상 맨 뒤에있어야한다.
		int total = 0;
		for(int num:nums) {
			total += num;
		}
		
		return total;
	}

	public static void main(String[] args) {
		//자바의 배열은 정적할당 
		//배열의 선언
		int[] arr1 = new int[10]; // 정수 10개를 저장하는 배열, 0으로 초기화 되어 들어감
		//초기값을 갖는 배열 
		int[] arr2 = { 1,2,3,4,5 }; //대괄호는 개수를 의미하는거기때문에 중괄호를 사용해야한다 
		int[] arr3;
		arr3 = new int[5]; //나중에 배열 초기화 
		
		//배열에 값 넣기 
		arr1[3] = 10; 
		System.out.println(Arrays.toString(arr1));
		
		//배열 출력
		for(int value : arr2) {
			System.out.print(value + " ");
		}
		
		//2차원 배열
		//선언 
		int[][] matrix = {
				{1, 2 ,3},
				{4, 5, 6}
		}; // 2*3 배
		
		System.out.println();
		for(int[] row:matrix) {
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j =0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		int sum = addNumbers(1,2,3,4,5);
		System.out.println("가변매개변수 : " + sum);
	}

}
