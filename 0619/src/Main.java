import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Drawable h = new Hero();
        h.draw();


        Triangle t1 = new Triangle(
                new Point(3,2),
                new Point(1,3),
                new Point(1,1));
        t1.draw();
        System.out.println(t1.getArea());

    }
}

