import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("input width: ");

        int width = scanner.nextInt();

        System.out.println("input height: ");

        int height = scanner.nextInt();



        Board board = new Board(width, height);

        GUI.boardDisplaySettings(board);

        SwingUtilities.invokeLater(() -> {
            GUI.gui();
        });

        board.print();
        System.out.println("Width: " + board.getWidth());
        System.out.println("Height: " + board.getHeight());


        scanner.close();
    }
}
