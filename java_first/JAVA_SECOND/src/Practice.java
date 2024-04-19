

public class Practice {
	
	public double calc(double radius) {
		return Math.PI * radius * radius ;
	}
	public double calc(double width, double height) {
		return width * height;
	}
	public double calc(double base, double height, boolean isTriangle) {
		if(isTriangle) {
			return base * height / 2;
		}else {
			return calc(base, height);
		}
	}

	public static void main(String[] args) {
			Practice prac = new Practice();
			
			System.out.println("반지름 5인 원 : " +  prac.calc(5));
			System.out.println("가로4, 세로7인 직사각형 : " + prac.calc(4,7));
			System.out.println("밑변6, 높이3인 삼각형 : " + prac.calc(6,3,true));
	}

}
