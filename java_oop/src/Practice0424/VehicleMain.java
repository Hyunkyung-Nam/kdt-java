package Practice0424;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[2];
		
		vehicles[0] = new Car("붕붕이",200 );
		vehicles[1] = new Airplane("뱅기", 500);
		
		for(Vehicle vehicle : vehicles) {
			vehicle.move();
			//indtanceof : 객체가 지정된 유형의 인스턴스인지 여부를 확인하는데 사용하는 비교 연산자
			if(vehicle instanceof Airplane) {
				((Flyable) vehicle).fly();
			}
		}
	}

}
