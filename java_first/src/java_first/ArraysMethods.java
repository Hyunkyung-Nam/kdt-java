package java_first;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		int[] arr = { 1 , 2 , 3 , 4 , 5 };
		//copyOf : 특정 길이만큼 복사한 새 배열을 반환
		int[] copyOfArr = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(copyOfArr));
		
		//copyOfRange : 시작 인덱스부터 종료 인덱스 전 까지의 부분을 복사한 새 배열을 반환
		int[] copyOfRangeArr = Arrays.copyOfRange(arr, 1, 4);
		System.out.println(Arrays.toString(copyOfRangeArr));
		
		// fill : 배열의 모든 요소를 주어진 값으로 채움 
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
		
		// fill로 부분요소 채우기
		
		int[] arr2 = new int[15];
		
		arr2[0] = 1;
		arr2[1] = 2;
		Arrays.fill(arr2, 2, arr2.length, 10); //해당배열,시작, 끝, 넣고싶은값 순서로 넣기 
		
		System.out.println(Arrays.toString(arr2));
		
		//sort : 배열을 오름차순으로 정렬
		int[] arr3 = {2,5,5,2,7,5,2,3,246,347,22,2341,23,9};
		
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr3));
		
		//equals : 두배열의 요소가 같은지 확인 
		int[] arr4 = { 1 , 2, 3, 4, 5 };
		System.out.println(Arrays.equals(arr, arr4));
		
		//deepEquals : 다차원 배열 비교
		int[][] arrs1 = {
				{1,2},
				{3,4}
		};
		int[][] arrs2 = {
				{1, 2},
				{3, 4},
		};
		
		System.out.println(Arrays.deepEquals(arrs1, arrs2));
		
		//binarySearch : 특정값의 인덱스 값 찾기. 단 배열은 정렬되어있어야함 
		int index = Arrays.binarySearch(arr3, 7);
		System.out.println(index);
		
	}

}
