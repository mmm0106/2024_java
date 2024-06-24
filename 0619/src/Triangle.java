import java.awt.*;


public class Triangle extends Shape implements Drawable,Measurable{
    Point p1;
    Point p2;
    Point p3;

    Triangle(Point p1,Point p2,Point p3){
        this.size = 1;
    }
    @Override
    public void draw(){
        System.out.println("三角を描きました。");
    }
    @Override
    public int getArea(){
        System.out.println();
        return 0;
    }
    @Override
    public int getPerimeter(){
        return 0;
    }
}