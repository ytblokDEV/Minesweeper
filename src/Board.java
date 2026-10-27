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

    public Cell getCell(int row, int col){
        return cells[row][col];
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