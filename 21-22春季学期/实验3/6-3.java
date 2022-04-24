import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = scan.nextDouble();
        Square s = new Square(length);
        System.out.printf("%.2f ",s.getPerimeter());
        System.out.printf("%.2f\n",s.getArea());

        length = scan.nextDouble();
        double wide = scan.nextDouble();
        Rectangle r = new Rectangle(length,wide);
        System.out.printf("%.2f ",r.getPerimeter());
        System.out.printf("%.2f\n",r.getArea());

        double radius = scan.nextDouble();
        Circle c = new Circle(radius);
        System.out.printf("%.2f ",c.getPerimeter());
        System.out.printf("%.2f\n",c.getArea());

        scan.close();
    }
}

/* 你的代码被嵌在这里 */
class Shape {
    protected double Per=0.0;
    protected double area=0.0;
    public double getPerimeter() {
        return Per;
    }

    public double getArea() {
        return area;
    }
}


class Square extends Shape{
    public Square(double length) {
        double Per=4*length;
        double area=length*length;
        this.Per=Per;
        this.area=area;
    }
}


class Rectangle extends Shape{
    public Rectangle(double length,double wide) {
        double Per=2*(length+wide);
        double area=length*wide;
        this.Per=Per;
        this.area=area;
    }

}

class Circle extends Shape{
    public Circle(double radius) {
        double Per=Math.PI*2*radius;
        double area=Math.PI*radius*radius;
        this.Per=Per;
        this.area=area;
    }
}