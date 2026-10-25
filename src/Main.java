import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input width: ");

        int width = scanner.nextInt();

        System.out.println("input height: ");

        int height = scanner.nextInt();

        Cell[][] board  = Board.createBoard(width,height);


        scanner.close();
    }
}
