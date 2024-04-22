package composition;

public class Classroom {
	
	private String roomName;
	private Student[] students; //객체 컴포지션
	
	public Classroom(String roomName, Student[] student) {
		this.roomName = roomName;
		this.students = student;
	}
	
	public void print() {
		System.out.println("우리는 코딩온 "+roomName +"기 입니다.");
		for(Student student:students) {
			student.print();
		}
	}

}
