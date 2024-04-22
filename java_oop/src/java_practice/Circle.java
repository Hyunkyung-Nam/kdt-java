package java_practice;

public class Circle {
		private final double radius;
		private static final double PI = Math.PI;
		
		Circle(double input) {
			this.radius = input;
		}
		public double getRadius() {
			return this.radius;
		}
		public double calculateArea() {
			return radius * radius * PI;
		}
		
}
