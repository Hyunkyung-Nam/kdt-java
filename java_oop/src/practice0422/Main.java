package practice0422;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요 : ");
		double inputRadius = scan.nextDouble();
		
		PracticeCircle circle = new PracticeCircle(inputRadius);
		
		circle.printInfo();
		
		scan.close();
		
		
		Student kim = new Kim("ABC 고등학교", "김철수", 20220001, 17);
		//오이렇게도 쓸수있나요 신기하네요 
		kim.todo();
		//다형성이라고 함
		// 상속 받았을 때 부모 어쩌구 = new 자식 이런식으로 사용할 수 있음
		//상속받은 클래스는 앞에 부모놓고 뒤에 자식 놓아서 많이 사용한다. 
		
		/*
		Kim kim = new Kim("ABC 고등학교", "김철수", 20220001, 17);
		Baek baek = new Baek("XYZ 고등학교", "백영희", 20220002, 18);
		
		kim.todo();
		System.out.println();
		baek.todo();

		Bus tayo = new Bus("타요","타요타요",2020, 30);
		
		tayo.start();
		tayo.parking();
		tayo.stop();
		
		Car g80 = new Car("현대", "G80", 2017, 5);
		g80.start();
		g80.parking();
		g80.stop();
		
		
		
		
		Cat nabi = new Cat(2,"나비");
		Dog dangdang = new Dog(1, "댕댕이");
		
		System.out.println(nabi.getSpecies() + "이름은 " + nabi.getName()+"이며 나이는 "+ nabi.getAge());
		System.out.println(dangdang.getSpecies() + "이름은 " + dangdang.getName()+"이며 나이는 "+ dangdang.getAge());
		*/
		
		
		
	

	}

}
