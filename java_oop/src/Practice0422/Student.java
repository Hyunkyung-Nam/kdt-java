package Practice0422;

public abstract class Student {
	private String school;
	private String name;
	private int age;
	private int studentId;
	
	public Student(String school, String name,int studentId, int age) {
		this.school = school;
		this.name = name;
		this.studentId = studentId;
		this.age = age;
	}
	
	abstract void todo();

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
