import javax.swing.*;
import java.awt.*;

public class GUI {
    private static int a = 0;
    private static int width = 0;
    private static int height = 0;

    public static void boardDisplaySettings(int width1, int height1){
        width = width1;
        height = height1;
    }

    public static void gui() {
        JFrame frame = new JFrame("Minesweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Button Cliked " + a + " times", SwingConstants.CENTER);
        text.setPreferredSize(new Dimension(300, 100));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(height, width));

        for (int i = 1; i <= 25; i++) {
            JButton button = new JButton("Btn " + i);
            button.setPreferredSize(new Dimension(100, 100));
            panel.add(button);
            button.addActionListener(e -> {
                a++;
                text.setText("Button Cliked " + a + " times");
            });
        }

//        button.addActionListener(e -> {
//            a++;
//            text.setText("Button Cliked " + a + " times");
//        });

//        frame.setLayout(new GridLayout(height, width));

        frame.add(text, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);


        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
