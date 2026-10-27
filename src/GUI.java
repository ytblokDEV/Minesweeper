import javax.swing.*;
import java.awt.*;

public class GUI {
    private static int a = 0;
    private static int width = 0;
    private static int height = 0;
    private static JPanel panel = new JPanel();

    public static void boardDisplaySettings(Board board) {
        height = board.getHeight();
        width = board.getWidth();

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(100,100));

                int r = row;
                int c = col;

                button.addActionListener(e -> {
                    Cell cell = board.getCell(r, c);
                    System.out.println(cell);
                });

                panel.add(button);
            }
        }
    }

    public static void gui() {
        JFrame frame = new JFrame("Minesweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("There is {PLACEHOLDER} mines left", SwingConstants.CENTER);
        text.setPreferredSize(new Dimension(300, 100));

        panel.setLayout(new GridLayout(height, width));

//        for (int row = 0; row < height; row++) {
//            for (int col = 0; col < width; col++) {
//
//                JButton button = new JButton();
//
//                int r = row;
//                int c = col;
//
//                button.addActionListener(e -> {
//                    Cell cell = Board.getCell(r, c);
//
//                    System.out.println("Kliknięto: " + r + ", " + c);
//                });
//
//                panel.add(button);
//            }
//        }

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
