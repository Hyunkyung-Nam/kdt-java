package practice0422;

public class Bus extends Vehicles {

	public Bus(String brand, String model, int year, int passengerCapacity) {		super(brand,model,year, passengerCapacity, 'C');
	}
	
	public void toStringBus() {
		System.out.print(super.getModel()+ " : ");
	}

	@Override
	public void start() {
		this.toStringBus();
		super.start();
	}
	@Override
	public void stop() {
		this.toStringBus();
		super.stop();
	}
	@Override
	public void parking() {
		this.toStringBus();
		super.parking();
	}
}
