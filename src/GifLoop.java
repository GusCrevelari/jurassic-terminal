import javax.swing.*;
import java.util.Objects;

public class GifLoop {
    // Show the GIF
    public static void startLoop(JTextArea terminal) {

        new Thread(() -> {
            try {
                Thread.sleep(2000);  // Wait before showing the GIF
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            JFrame frame = new JFrame();
            ImageIcon icon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/magicword.gif")));
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

            new Thread(() -> {
                while (true) {
                    terminal.append("YOU DIDN'T SAY THE MAGIC WORD!\n");
                    terminal.setCaretPosition(terminal.getDocument().getLength());

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }).start();

        }
    }

