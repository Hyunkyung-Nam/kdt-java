package practice0422;

public class Vehicles {
	private String brand;
	private String model;
	private int year;
	private int passengerCapacity;
	private char licenseType;
	
	public Vehicles(String brand, String model, int year, int passengerCapacity, char licenseType ) {
		this.brand = brand;
		this.model = model;
		this.passengerCapacity = passengerCapacity;
		this.year = year;
		this.licenseType = licenseType;
	}
	public String getModel() {
		return model;
	}
	public void start() {
		System.out.println("시동을 걸었습니다");
	}
	public void parking() {
		System.out.println("주차했습니다.");
	}
	public void stop() {
		System.out.println("정지했습니다.");
	}
}
