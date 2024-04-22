package store;

public class BookStore {
	
	//변수(필드, 데이터, 멤버변수)
	private String name;
	private int books;
	
	//생성자
	public BookStore(String name, int books) {
		this.name = name;
		this.books = books;
	}
	
	//메소드 
	public void print() {
		System.out.println("서점 명은 "+this.name + ", 책 수량은 "+this.books+"권 입니다.");
	}
}
