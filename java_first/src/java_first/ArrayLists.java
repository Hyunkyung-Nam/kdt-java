package java_first;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//add : 요소 추가 
		list.add("Google");
		list.add("Samsung");
		list.add(1, "Amazon");
		
		System.out.println(list); //얘는 Arrays.toString안하고 그냥 출력하면된다 
		
		//addAll : 여러 요소 일괄적으로 추가 
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Microsoft");
		
		list.addAll(list2);
		System.out.println(list);
		
		//size : 배열 길이 확인
		System.out.println(list.size());
		
		//contains(params) : ArrayList에 params를 포함하는지 확인 
		System.out.println(list.contains("Hyundai"));
		System.out.println(list.contains("Apple"));
		
		//get : index에 해당하는 값 가져오기 
		System.out.println(list.get(2));
		//set(index, element) : 해당하는 index에 element로 교체 
		System.out.println(list.set(0, "Hyundai"));
		System.out.println(list);
		
		//indexOf : 요소의 인덱스 값 찾기 (있으면 인덱스값, 없으면 -1 반환)  
		System.out.println(list.indexOf("Amazon"));
		System.out.println(list.indexOf("Google"));
		
		//remove : 요소 삭제 
		list.remove(1); //index넣어도되고 요소 넣어도된다
		list.remove("Microsoft");
		System.out.println(list);
		
		//isEmpty : Arraylist가 비어있는지 확인
		System.out.println(list.isEmpty());
		
		//clear : 모든 요소 삭제 
		list.clear();
		System.out.println(list.isEmpty());
	}

}
