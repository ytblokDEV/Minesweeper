public class Board {

    private Cell[][] cells;

    public Board(int width, int height) {
        cells = new Cell[height][width];

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                cells[row][col] = new Cell(false);
            }
        }
    }

    public int getHeight() {
        return cells.length;
    }

    public int getWidth() {
        return cells[0].length;
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public void setMine(int row, int col) {
        cells[row][col].setMine();
    }

    public boolean isMine(int row, int col) {
        return cells[row][col].isMine();
    }

    public int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {

                if (dr == 0 && dc == 0) {
                    continue;
                }

                int neighborRow = row + dr;
                int neighborCol = col + dc;

                if (neighborRow >= 0 && neighborRow < getHeight() && neighborCol >= 0 && neighborCol < getWidth()) {
                    if (cells[neighborRow][neighborCol].isMine()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int getMinesAmount(){
        return (int)(cells.length * cells[0].length * 0.21);
    }

    public boolean isFlagged(int row, int col) {
        return cells[row][col].isFlagged();
    }

    public void toggleFlag(int row, int col){
        cells[row][col].toggleFlag();
    }

    public boolean isRevealed(int row, int col){
        return cells[row][col].isRevealed();
    }

    public void reveal(int row, int col){
        cells[row][col].reveal();
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