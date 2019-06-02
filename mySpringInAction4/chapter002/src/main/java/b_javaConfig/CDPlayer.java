package b_javaConfig;

import b_javaConfig.CompactDisc;
import b_javaConfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
}
