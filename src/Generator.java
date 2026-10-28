import java.util.Random;

public class Generator {
    private static int height;
    private static int width;
    private static int minesAmount;

    public static Board setup(Board board) {
        height = board.getHeight();
        width = board.getWidth();
        minesAmount = (int) (width * height * 0.21);
        generateMines(board);
        return board;
    }

    private static void generateMines(Board board) {
        Random random = new Random();
        int minesPlaced = 0;

        while (minesAmount > minesPlaced) {
            int row = random.nextInt(height);
            int col = random.nextInt(width);

            if (board.isMine(row, col)) {
                continue;
            }
                board.setMine(row, col);
                minesPlaced++;
        }
    }
}
