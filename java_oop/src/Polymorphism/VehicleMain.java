package Polymorphism;
import java.util.ArrayList;

public class VehicleMain {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Car());
		vehicles.add(new Airplane());

		for(Vehicle vehicle:vehicles) {
			vehicle.move();
			if(vehicle instanceof Airplane) {
				((Airplane) vehicle).fly();
			}
		}

	}

}
