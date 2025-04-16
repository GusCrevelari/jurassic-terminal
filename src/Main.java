// All the imports needed

import javax.swing.*; // pulls package for building a Graphical User Interface
import java.awt.*; // goes along with awt... used to change fonts, colors...
import java.awt.event.ActionEvent; //
import java.awt.event.ActionListener; //
import java.util.Scanner; // Simple scanner

// Starting with a Main class...

public class Main {
    public static void main(String[] args) throws InterruptedException { // InterruptedException for thread.sleep
                                                                        // to work.

        // Simple scanner to start...

        Scanner scanner = new Scanner(System.in);

        // This is where the new window is created.
        //  JFrame is used so we can create the actual window
        // This is where I can set up the general size, title...

        JFrame terminalFrame = new JFrame("Central Park Control Console");
        terminalFrame.setIconImage(null);
        terminalFrame.setSize(1200, 768); // Width, Height
        terminalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        terminalFrame.setVisible(true); // ← This is what makes it pop up!

        // JTextArea is used to set up to display texts, inputs and outputs.

        JTextArea terminal = new JTextArea();
        terminal.setBackground(new Color(0,0,139));
        terminal.setForeground(Color.white);
        terminal.setFont(new Font("Monospaced", Font.PLAIN, 14));
        terminal.setEditable(false);

        // Added an actual terminal to the terminalFrame variable from above.
        // Append is used to actually show text

        terminalFrame.add(terminal);
        terminal.append("Jurassic Park, System Security Interface\n");
        terminal.append("Version 3.0.5, Alpha E\n");
        terminal.append("Ready...\n");
        terminal.append("> access security \n");



        // Then we need to make it ''inputable'' using JTextField....

        JTextField inputType = new JTextField();

        JScrollPane scrollPane = new JScrollPane(terminal);
        terminalFrame.add(scrollPane, BorderLayout.CENTER);
        terminalFrame.add(inputType, BorderLayout.SOUTH);

        inputType.addActionListener(new ActionListener() {

            private int attempts = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputType.getText();
                inputType.setText("");

                if (input.equals("fwthadtr")) {
                    terminal.append("Access Granted\n");
                    inputType.setEditable(false); // Stop accepting Input
                } else {
                    attempts++;
                    terminal.append("PERMISSION DENIED\n");
                }

                if (attempts >= 3) {
                    terminal.append("PERMISSION DENIED... and...\n");
                }
            }

        });

    //git test....



        System.out.println("Jurassic Park, System Security Interface");
        System.out.println("Version 3.0.5, Alpha E");
        System.out.println("Ready...");

        String userInput;



        for (int counter = 0; counter < 3; counter++) {
            System.out.print("> access ");
            userInput = scanner.nextLine();

            if (userInput.equals("fwthadtr")) {
                System.out.println("Access Granted");
                return;
            }
            if (counter == 2) {
                System.out.print("PERMISSION DENIED...");
                Thread.sleep(800);
                System.out.println("and...");
                Thread.sleep(800);
            } else {
                Thread.sleep(800);
                System.out.println("PERMISSION DENIED.");
            }
        }

            JFrame frame = new JFrame();

            ImageIcon icon = new ImageIcon(Main.class.getResource("/magicword2.gif"));

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

            while (true) {
                System.out.println("YOU DIDN'T SAY THE MAGIC WORD!");
                System.out.println("YOU DIDN'T SAY THE MAGIC WORD!");
                Thread.sleep(200);
}



    }
}





