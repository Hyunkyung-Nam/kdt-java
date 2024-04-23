package java_generic;

public class Main {

	public static void main(String[] args) {
//		MyClass list = new MyClass();
//		
//		list.addElement("Apple");
//		list.addElement("Amazon");
//		list.addElement("Samsung");
//		
//		System.out.println(list.list.toString());
		
		MyCustom<String> list = new MyCustom<>();
		list.addElement("HI");
		list.addElement("BYE");
		
		System.out.println(list.list.toString());
		
		MyCustom<Integer> list2 = new MyCustom<>();
		list2.addElement(2);
		list2.addElement(3);
		System.out.println(list2.list.toString());
	}

}
