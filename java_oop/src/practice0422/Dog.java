package practice0422;

public class Dog extends Animal {
	public Dog(int age, String name) {
		super("강아지", name, age);
//		setSpecies("강아지");
//		setAge(age);
//		setName(name);
		setLegs(4);
	}
	public String makeSound() {
		return super.makeSound() + "멍";
	}
}
