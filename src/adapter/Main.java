package adapter;

public class Main {

	public static void main(String[] args) {
		
		MediaPlayer myMediaPlayer = new AudioPlayer();
		
		myMediaPlayer.play("mp3", "File 1");
		
		myMediaPlayer.play("mp4", "File 1");
	}

}
