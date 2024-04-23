package practice_0423;

public class Mp3PlayerMartin implements MusicMartin {

	@Override
	public void play() {
		System.out.println("MP3 플레이어에서 '아이유 블루밍' 음악을 재생합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("MP3 플레이어에서 '아이유 블루밍' 음악을 정지합니다.");
		
	}

}
