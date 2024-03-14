public class Spot {
    int x;
    int y;
    String player;

    public Spot(int x, int y, String player){
        this.setX(x);
        this.setY(y);
        this.setPlayer(player);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
