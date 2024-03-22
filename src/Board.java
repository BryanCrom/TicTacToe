public class Board{
    Spot[][] board;

    public Board(){
        this.clearBoard();
    }

    public void clearBoard(){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                board[row][col] = new Spot(row, col, ' ');
            }
        }
    }

    public Spot getSpot(int row, int col) {
        try{
            return board[row][col];
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("This position does not exist on the board");
        }
        return null;
    }
}