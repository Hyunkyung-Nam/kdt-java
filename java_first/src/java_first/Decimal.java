package java_first;

import java.math.BigDecimal;

public class Decimal {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("0.2"); //숫자로 적으면 안되고 문자열형태로 적어야한다 
		BigDecimal b = new BigDecimal("0.5");
		
		BigDecimal sum = a.add(b); 
		BigDecimal diff = a.subtract(b);
		BigDecimal multi = a.multiply(b);
		BigDecimal div = a.divide(b);
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(multi);
		System.out.println(div);
		
	}

}
