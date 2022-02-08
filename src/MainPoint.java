import java.awt.*;
import java.util.List;

public class MainPoint {
    public static void main(String[] args) {

        Point p1 = new Point(4,5);
        Point p2 = new Point(6,8);
        System.out.println(p1 + " " + p2);
        p1.moveTo(5,5);
        p2.setOffset(4,4);
        System.out.println(p1 + " " + p2);


        Segmento s1 = new Segmento(p1,p2);
        s1.setOffset(4,4);
        System.out.println(s1);




    }


}
