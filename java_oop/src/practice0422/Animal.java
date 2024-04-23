package practice0422;

public class Animal {
	private String name;
	private int age;
	private String species;
	private int legs;
	
	public Animal(String species, String name, int age) {
		this.species = species;
		this.name = name;
		this.age = age;
		
	}
	
	public String makeSound() {
		return "동물은 소리를 낸다";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
}
