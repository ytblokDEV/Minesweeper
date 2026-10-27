import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("input width: ");

        int width = scanner.nextInt();

        System.out.println("input height: ");

        int height = scanner.nextInt();



        Board board1 = new Board();
        Cell[][] board = board1.createBoard(width, height);

        GUI.gui();

        board1.print();
        System.out.println("Width: " + board1.getWidth());
        System.out.println("Height: " + board1.getHeight());


        scanner.close();
    }
}
