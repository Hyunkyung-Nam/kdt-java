package Practice0424;

public class PairMain {

	public static void main(String[] args) {
		Pair<String, Integer> pair1 = new Pair<>("One", 1);
		Pair<Integer, String> pair2 = new Pair<>(2,"Two");
		
		System.out.println(pair1.toString());
		System.out.println(pair2.toString());

	}

}
