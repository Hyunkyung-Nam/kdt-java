package Practice0422;

public class Baek extends Student {

	public Baek(String school, String name, int studentId, int age) {
		super(school,name,studentId,age);
	}

	@Override
	public void todo(){
		printDetail();
		System.out.println("점심은 백종원 피자");
	}
	public void printDetail() {
		System.out.println("=== " + getName() + " 학생의 정보 ==="+ "\n"
				+ "학교 : "+getSchool() +"\n" 
				+ "나이 : " + getAge()+ "\n"
				+ "학번 : " + getStudentId()
				);
	}
}
