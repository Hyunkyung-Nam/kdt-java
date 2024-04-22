package java_inherit;

public class Person {
	private int age;
	private String name;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	//어노테이션 적어줘서 상속받는걸 알려줌 
	//Override annotation이며 상속 받았다는 것을 명시적으로 알려주기 위해서 작성 
	public String toString() {
		return "이름은 " + name + ", 나이는 " + age + "입니다";
	}
	//getter, setter, toString 모두 source에서 만들 수 있음 
}
