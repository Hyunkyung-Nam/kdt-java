package Practice0422;

public class Cat extends Animal {
	
	public Cat(int age, String name) {
		super("고양이", name, age);
//		setSpecies("고양이");
//		setAge(age);
//		setName(name);
		setLegs(4);
	}
	@Override
	public String makeSound() {
		return super.makeSound() + "야옹";
	}
	
}
