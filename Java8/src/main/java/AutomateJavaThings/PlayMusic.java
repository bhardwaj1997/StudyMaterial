package AutomateJavaThings;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineEvent.Type;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class PlayMusic implements LineListener {


  public static void main(String[] args) throws LineUnavailableException {
  String path = "C:\\Users\\KuldeepB\\test.wav";
  PlayMusic playMusic = new PlayMusic();
  playMusic.play(path);
  }

  boolean playCompleted;
  private void play(String path) throws LineUnavailableException {
    File audioFile = new File(path);
    try {
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
      AudioFormat format = audioInputStream.getFormat();
      DataLine.Info info = new Info(Clip.class,format);
      Clip audioClip = (Clip) AudioSystem.getLine(info);
      audioClip.addLineListener(this);
      audioClip.open(audioInputStream);
      audioClip.start();

      while ((!playCompleted)){
        try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        audioClip.stop();
      }

    } catch (UnsupportedAudioFileException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  @Override
  public void update(LineEvent lineEvent) {
  LineEvent.Type type = lineEvent.getType();
    if (type == Type.START) System.out.println("type = " + type);
    else if(type==Type.STOP)
    {
      playCompleted= true;
      System.out.println("type = " + type);
    }
  }
}
