package practice_0423;

public class CdPlayer implements MusicPlayer {
	private final String player = "CD Player";
	private String song;
	private String singer;
	
	CdPlayer(String song, String singer){
		this.song = song;
		this.singer = singer;
	}

	@Override
	public void play() {
		System.out.printf("%s에서 '%s %s' 음악을 재생합니다.\n",player, singer,song);
		
	}

	@Override
	public void stop() {
		System.out.printf("%s에서 '%s %s' 음악을 정지합니다.\n",player, singer,song);
		
	}
	@Override
	public void playerInfo() {
		System.out.printf("=== %s ===\n",player );
	}

}

