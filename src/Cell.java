public class Cell {
    private boolean isMine;
    private boolean isDug;
    private boolean isFlagged;
        public Cell(boolean isMine,boolean isDug,boolean isFlagged){
            this.isDug = false;
            this.isMine = false;
            this.isFlagged = false;
        }

    public boolean isMine() {
        return isMine;
    }
    public boolean isDug(){
            return isDug;
    }

    public boolean isFlagged() {
        return isFlagged;
    }
}
