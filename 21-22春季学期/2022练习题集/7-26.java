
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle r[] = new Rectangle[2];
        r[0] = new Rectangle(in.nextInt(),in.nextInt());
        r[1] = new Rectangle(in.nextInt(),in.nextInt());
        Circle c[] = new Circle[2];
        c[0] = new Circle(in.nextInt());
        c[1] = new Circle(in.nextInt());
        System.out.println(r[0].getPerimeter()+r[1].getPerimeter()+c[0].getPerimeter()+c[1].getPerimeter());
        System.out.println(r[0].getArea()+r[1].getArea()+c[0].getArea()+c[1].getArea());
        System.out.println(Arrays.deepToString(r));
        System.out.println(Arrays.deepToString(c));
    }
}

class Rectangle {
    private int width,length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getPerimeter() {
        return 2*(width+length);
    }

    public int getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getPerimeter() {
        return (int) (2*radius*Math.PI);
    }

    public int getArea() {
        return (int) (Math.PI*radius*radius);
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }
}