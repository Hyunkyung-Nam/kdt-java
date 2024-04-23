package practice_0423;

public class MusicMainMartin {
	
	public void musicPlayer(MusicMartin player, String play) {	
		System.out.println("===" + play +  "Player ===");
		player.play();
		player.stop();
	}

	public static void main(String[] args) {
		
		MusicMainMartin music = new MusicMainMartin();
		
		
		MusicMartin mp3 = new Mp3PlayerMartin();
		MusicMartin cd = new CdPlayerMartin();
		
		music.musicPlayer(mp3,"MP3");
		music.musicPlayer(cd, "CD");

	}

}
