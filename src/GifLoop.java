import javax.swing.*;
import java.util.Objects;

public class GifLoop {
    // Show the GIF
    public static void startLoop(JTextArea terminal) {

        new Thread(() -> {
            while (true) {
                terminal.append("YOU DIDN'T SAY THE MAGIC WORD!\n");
                terminal.append("YOU DIDN'T SAY THE MAGIC WORD!\n");
                terminal.setCaretPosition(terminal.getDocument().getLength());

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(3000);  // Wait before showing the GIF
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            JFrame frame = new JFrame();
            ImageIcon icon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/img/nerdy.gif")));
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.pack();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setAlwaysOnTop(true);
            frame.setState(JFrame.NORMAL);
            frame.toFront();
            frame.requestFocus();
            frame.setLocationRelativeTo(null);

            SoundPlayer.playSoundOnce("magicWord.wav");

            new Thread(() -> {
                try {
                    Thread.sleep(3200);  // Wait for the first audio to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                SoundPlayer.playSoundLoop("AhAhAh.wav");
            }).start();

        }).start();

    }
}

