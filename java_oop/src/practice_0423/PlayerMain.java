package practice_0423;

import java.util.ArrayList;

public class PlayerMain {

	public static void main(String[] args) {
		MusicPlayer cd = new CdPlayer("거짓말","빅뱅");
		MusicPlayer mp3 = new Mp3Player("Fiction","비스트");
		
		ArrayList<MusicPlayer> players = new ArrayList<>();
		players.add(cd);
		players.add(mp3);
		
		for(MusicPlayer player :players) {
			player.playerInfo();
			player.play();
			player.stop();
		}

	}

}
