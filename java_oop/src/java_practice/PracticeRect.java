package java_practice;

public class PracticeRect {
	private int width;
	private int height;
	//static 변수 추가
	// 정적변수로 보통 상수취급한다. 
	private static int COUNT = 0;
	
	public PracticeRect(int inputWidth){
		this.width = inputWidth;
		COUNT++;
	}

	public int getArea() {
		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	//static 메소드 추가
	public static int getCount() {
		return COUNT;
	}
	
}
