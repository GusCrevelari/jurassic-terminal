import javax.sound.sampled.*; //Handle audio playback
import java.io.IOException; // Handles file-related exceptions
import java.net.URL; // Allows locating resources inside a project

public class SoundPlayer {
    public static void playSoundOnce(String fileName) {

        try {
            URL soundURL = Main.class.getResource("/sound/magicWord.wav"); // Load the File
            assert soundURL != null;
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundURL);// Reads the File
            Clip clip = AudioSystem.getClip(); // Clip is like a cassete player
            clip.open(audioInput); // Load the audioUInput into clip (Cassete)
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }
    public static void playSoundLoop(String fileName) {
        try {
            URL soundURL = Main.class.getResource("/sound/AhAhAh.wav");
            assert soundURL != null;
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // This loops it forever
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public static void playKeyboard(String fileName) {
        try {
            URL soundURL = Main.class.getResource("/sound/beep1.wav");
            assert soundURL != null;
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public static void playKeyboardLoop(String fileName) {
        try {
            URL soundURL = Main.class.getResource("/sound/beep2.wav");
            assert soundURL != null;
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
