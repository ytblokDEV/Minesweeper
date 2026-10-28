import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.atomic.AtomicInteger;

public class GUI {
    private static int width = 0;
    private static int height = 0;
    private static JPanel panel = new JPanel();
    private static JLabel text;

    public static void boardInitialization(Board board) {
        height = board.getHeight();
        width = board.getWidth();
        AtomicInteger minesAmount = new AtomicInteger(board.getMinesAmount());

        text = new JLabel("There is " + minesAmount + " mines left", SwingConstants.CENTER);

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                JButton button = new JButton();
                button.setFocusPainted(false);
                button.setPreferredSize(new Dimension(50, 50));

                int r = row;
                int c = col;

                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (SwingUtilities.isLeftMouseButton(e)) {
                            if (board.isFlagged(r, c) || board.isRevealed(r, c)) {
                                return;
                            }
                            if (board.isMine(r, c)) {
                                button.setText("💣");
                            } else {
                                int mines = board.countAdjacentMines(r, c);

                                switch (mines) {
                                    case 1 -> button.setForeground(Color.BLUE);
                                    case 2 -> button.setForeground(new Color(0, 128, 0));
                                    case 3 -> button.setForeground(Color.RED);
                                    case 4 -> button.setForeground(new Color(0, 0, 128));
                                    case 5 -> button.setForeground(new Color(128, 0, 0));
                                    case 6 -> button.setForeground(Color.CYAN);
                                    case 7 -> button.setForeground(Color.BLACK);
                                    case 8 -> button.setForeground(Color.GRAY);
                                }
                                button.setText(mines == 0 ? "" : String.valueOf(mines));
                            }
                            button.setBackground(new Color(180, 180, 180));
                            board.reveal(r, c);
                        }
                        if (SwingUtilities.isRightMouseButton(e)) {
                            if (!board.isRevealed(r, c)) {
                                if (board.isFlagged(r, c)) {
                                    board.toggleFlag(r, c);
                                    text.setText("There is " + minesAmount.incrementAndGet() + " mines left");
                                    button.setText("");
                                } else {
                                    text.setText("There is " + minesAmount.decrementAndGet() + " mines left");
                                    button.setText("🚩");
                                    board.toggleFlag(r, c);
                                }
                            }
                        }
                    }
                });

                panel.add(button);
            }
        }

        panel.revalidate();
        panel.repaint();
    }

    public static void gui() {
        JFrame frame = new JFrame("Minesweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text.setPreferredSize(new Dimension(300, 100));

        panel.setLayout(new GridLayout(height, width));

        frame.add(text, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
