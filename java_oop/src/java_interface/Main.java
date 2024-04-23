package java_interface;

public class Main {

	public static void main(String[] args) {
//		DiabloGame diablo = new DiabloGame();
//		LoLGame lol = new LoLGame();
		
//		diablo.up();
//		diablo.down();
//		diablo.left();
//		diablo.right();
//		diablo.spacebar();
//		System.out.println();
//		
//		GameConsole.staticPrint();
		//static은 접근해서 바로 쓴다. 
		
//		System.out.println();
//		lol.up();
//		lol.down();
//		lol.left();
//		lol.right();
//		lol.spacebar();
		
		//다형성
		//게임콘솔을 배열을 사용하여 다형성 사용
		//어떤 부모의 타입으로 일괄적으로 처리하기 위해 이런식으로 사용
		//부모에 넣고 쓰는 것 자체가 범용성도 있음?ㄴ
		GameConsole  diablo = new DiabloGame();
		GameConsole lol = new LoLGame();
		
		GameConsole[] games = {diablo, lol};
		
		for(GameConsole game:games) {
			game.up();
			game.down();
			game.left();
			game.right();
			game.spacebar();
			System.out.println();
		}
		

	}

}
