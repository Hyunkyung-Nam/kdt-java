package collection;

import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		//LinkedList : 데이터의 삽입 및 삭제가 빈번하게 일어나는 작업에 적합
		//ArrayList : 데이터의 접근이 많고 삽입 및 삭제가 적은 경우에 적합
		List<String> linked = new LinkedList<>();  //다형성을 위해 이렇게 사용
		
		linked.add("A");
		linked.add("B");
		linked.add(1, "C");
		
		linked.remove("C");
		
		System.out.println(linked);
	
		//Set
		//HashSet : 중복 제거, 요소의 순서를 보장하지 않는다. 
		Set<String> hashSet = new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("A");
		System.out.println(hashSet);
		
		//LinkedHashSet : 중복제거, HashSet기능 유지 , 추가 순서를 유지한다. 
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		System.out.println(linkedHashSet);
		
		//TreeSet : 중복도 제거하고 오름차순으로 정렬해서 나옴 , 시간 복잡도가 증가 
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("B");
		treeSet.add("D");
		treeSet.add("C");
		treeSet.add("A");
		System.out.println(treeSet);
		
		//Map
		//HashMap :key가 보통 앞에와서 String에 넣
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("one", 1);
		hashMap.put("two", 2);
		hashMap.put("three", 3);
		System.out.println(hashMap);
		
		//LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("three", 3);
		linkedHashMap.put("one",1);
		linkedHashMap.put("two",2);
		System.out.println(linkedHashMap);
		
		//TreeMap
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("c", 3);
		treeMap.put("a", 1);
		treeMap.put("b", 2);
		System.out.println(treeMap);
	}

}
