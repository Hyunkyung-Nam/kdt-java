package java_oop;

public class Rectangle {
	private int width;
	private int height;
	

	
	public Rectangle(int inputWidth){
		this.width = inputWidth;
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
	
	
}
