public class Board {

    private Cell[][] board;

    public Cell[][] createBoard(int width, int height) {
        this.board = new Cell[height][width];
        return this.board;
    }

    public int getHeight() {
        return board.length;
    }

    public int getWidth() {
        return board[0].length;
    }


    public void print() {
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                System.out.print("[] ");
            }
            System.out.print("\n");
        }
    }
}