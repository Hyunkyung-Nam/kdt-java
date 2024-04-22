package Practice0422;

public class Car extends Vehicles {
	public Car(String brand, String model, int year, int passengerCapacity) {
		super(brand,model,year, passengerCapacity, 'A');
	}
	
	public void toStringCar() {
		System.out.print(super.getModel()+ " : ");
	}

	@Override
	public void start() {
		this.toStringCar();
		super.start();
	}
	@Override
	public void stop() {
		this.toStringCar();
		super.stop();
	}
	@Override
	public void parking() {
		this.toStringCar();
		super.parking();
	}
}
