public class Cell {
    private boolean isMine;
    private boolean isDug;
    private boolean isFlagged;
    private int neighborMines;

    public Cell(boolean isMine) {
        this.isDug = false;
        this.isMine = isMine;
        this.isFlagged = false;
        this.neighborMines = 0;
    }

    public boolean isMine() {
        return isMine;
    }

    public boolean isDug() {
        return isDug;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public int getNeighborMines() {
        return neighborMines;
    }

    public void setNeighborMines(int neighborMines) {
        this.neighborMines = neighborMines;
    }

    public void setMine() {
        isMine = true;
    }

    public void toggleFlag() {
        if (!isDug) {
            isFlagged = !isFlagged;
        }
    }

    public String dig() {
        if (isFlagged()) {
            return ("You can't dig here (you placed a flag here)");
        } else if (isDug()) {
            return ("You already dug here");
        } else if (isMine()) {
            isDug = true;
            return ("You lost");
        }
        isDug = true;
        return ("Safe");
    }
}
