import javax.swing.*;
import java.awt.*;

public class GUI {
    private static int a = 0;
    public static void gui(){
        JFrame frame = new JFrame("Minesweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Clik me",null);
        button.setPreferredSize(new Dimension(300,100));
        JLabel text = new JLabel("Button Cliked" + a + "times",SwingConstants.CENTER);
        text.setPreferredSize(new Dimension(300,100));
        frame.add(text, BorderLayout.CENTER);
        frame.add(button, BorderLayout.CENTER);
        button.addActionListener(e -> {a++;});

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
