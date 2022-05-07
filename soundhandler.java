package newGame;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class soundhandler {
	 public static void runmusic(String path) {
		 try {
			AudioInputStream inputstream =AudioSystem.getAudioInputStream(new File(path));
			Clip clip=AudioSystem.getClip();
			clip.open(inputstream);
			clip.loop(0);
		} catch (UnsupportedAudioFileException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}

}
