import javax.swing.*;
import java.util.Objects;

public class GifLoop {
    // Show the GIF
    public static void startLoop(JTextArea terminal) {


        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/magicword2.gif")));
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
                terminal.append("YOU DIDN'T SAY THE MAGIC WORD!!\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    // Loop the mensage forever
}