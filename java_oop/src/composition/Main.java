package composition;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 22);
		Student s2 = new Student("성춘향", 24);
		Student s3 = new Student("이몽룡", 20);
		
		Student[] students = {s1, s2, s3};
		
		Classroom kdt11 = new Classroom("KDT11", students);
		
		kdt11.print();

	}

}
