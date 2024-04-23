package java_generic;

import java.util.ArrayList;

//제네릭 클래스 
/*
 * 
 * 타입 제한 걸수 있다. //  <T extends Number> 
public class MyCustom<T extends Number> {
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	public void removeElement(T element) {
		list.remove(element);
	}
}
*/
public class MyCustom<T> {
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	public void removeElement(T element) {
		list.remove(element);
	}
}
