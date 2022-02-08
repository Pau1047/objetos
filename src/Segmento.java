public class Segmento {

    private Point startPoint;

    public Point getStartPoint() {
        return startPoint;
    }

    private Point endPoint;

    public Point getEndPoint() {
        return endPoint;
    }

    public Segmento(){
        startPoint = new Point(0,0);
        endPoint = new Point(0,0);
    }

    public Segmento(Point startPoint, Point endPoint){
    this.startPoint = startPoint;
    this.endPoint = endPoint;
    }

    public double distancia (){
        int dx= startPoint.getX() - endPoint.getX();
        int dy= startPoint.getY() - endPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Segmento("+ startPoint +
                " - " + endPoint +
                ')';
    }

    public void setOffset(int offX, int offY){
        this.startPoint.setOffset(offX, offY);
        this.endPoint.setOffset(offX, offY);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }



}
