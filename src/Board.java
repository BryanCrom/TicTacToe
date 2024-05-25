public class Board{
    private final Spot[][] board;
    private boolean turn;

    public Board(){
        turn = true;
        this.board = new Spot[3][3];
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

    public void setSpot(int row, int col){
        Spot spot = getSpot(row, col);
        spot.setPlayer(getTurn());
        turn = !turn;
    }

    public char getTurn() {
        if(turn){
            return 'X';
        }
        else {
            return 'O';
        }
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public char checkResults(){
        if(getSpot(0,0).getPlayer() != ' '){
            if(getSpot(0,0).getPlayer() == getSpot(0,1).getPlayer() && getSpot(0,1).getPlayer() == getSpot(0,2).getPlayer()){
                return getSpot(0,0).getPlayer();
            }
            if(getSpot(0,0).getPlayer() == getSpot(1,0).getPlayer() && getSpot(1,0).getPlayer() == getSpot(2,0).getPlayer()){
                return getSpot(0,0).getPlayer();
            }
            if(getSpot(0,0).getPlayer() == getSpot(1,1).getPlayer() && getSpot(1,1).getPlayer() == getSpot(2,2).getPlayer()){
                return getSpot(0,0).getPlayer();
            }
        }
        if(getSpot(1,1).getPlayer() != ' '){
            if(getSpot(1,1).getPlayer() == getSpot(0,1).getPlayer() && getSpot(0,1).getPlayer() == getSpot(2,1).getPlayer()){
                return getSpot(1,1).getPlayer();
            }
            if(getSpot(1,1).getPlayer() == getSpot(1,0).getPlayer() && getSpot(1,0).getPlayer() == getSpot(1,2).getPlayer()){
                return getSpot(1,1).getPlayer();
            }
            if(getSpot(1,1).getPlayer() == getSpot(0,2).getPlayer() && getSpot(0,2).getPlayer() == getSpot(2,0).getPlayer()){
                return getSpot(1,1).getPlayer();
            }
        }
        if(getSpot(2,2).getPlayer() != ' '){
            if(getSpot(2,2).getPlayer() == getSpot(2,1).getPlayer() && getSpot(2,1).getPlayer() == getSpot(2,0).getPlayer()){
                return getSpot(2,2).getPlayer();
            }
            if(getSpot(2,2).getPlayer() == getSpot(1,2).getPlayer() && getSpot(1,2).getPlayer() == getSpot(0,2).getPlayer()){
                return getSpot(2,2).getPlayer();
            }
        }
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(getSpot(row,col).getPlayer() == ' '){
                    return ' ';
                };
            }
        }
        return 'D';
    }
}