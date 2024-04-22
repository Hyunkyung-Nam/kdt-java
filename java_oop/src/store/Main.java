package store;
import java_oop.Car;

public class Main {

	public static void main(String[] args) {
		BookStore bookStore = new BookStore("양갱서점", 5);

		bookStore.print();
		
		Car kia = new Car(20);
		
		System.out.println(kia.getSpeed());
		
	}

}
