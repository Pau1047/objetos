public class Point {

    private int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    private int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x=0;
        this.y=0;
    }

    @Override
    public String toString() {
        return "(" + x +", " + y +')';
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setOffset(int offX, int offY){
        this.x += offX;
        this.y += offY;
    }


}
