public class Spot {
    int row;
    int col;
    char player;

    public Spot(int row, int col, char player){
        this.setRow(row);
        this.setCol(col);
        this.setPlayer(player);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
    this.player = player;
    }
}