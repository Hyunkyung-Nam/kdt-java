package java_generic;

import java.util.ArrayList;

//일반클래스 
public class MyClass {
	ArrayList<String> list = new ArrayList<>();
	
	public void addElement(String element) {
		list.add(element);
	}
	public void removeElement(String element) {
		list.remove(element);
	}

}
