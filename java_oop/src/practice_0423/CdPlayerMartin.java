package practice_0423;

public class CdPlayerMartin implements MusicMartin{

	@Override
	public void play() {
		System.out.println("CD 플레이에서 '아이유 꽃갈피' 앨범을 재생합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("CD 플레이에서 '아이유 꽃갈피' 앨범을 정지합니다.");
		
	}
	

}
