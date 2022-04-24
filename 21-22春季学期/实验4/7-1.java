
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

abstract class Shape {
    public static double PI=3.14;
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract double sumAllArea(double allArea);
    public abstract double sumAllPerimeter(double allPerimeter);
    public String toString() {
        return super.toString();
    }
}

class Rectangle extends Shape {
    private int width,length;
    public Rectangle(int width,int length) {
        this.width=width;this.length=length;
    }
    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double sumAllPerimeter(double allPerimeter) {
        return allPerimeter+this.getPerimeter();
    }
    @Override
    public double sumAllArea(double allArea) {
        return allArea+this.getArea();
    }
    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}

class Circle extends Shape {
    private int radius;
    public Circle(int radius) {
        this.radius=radius;
    }
    @Override
    public double getPerimeter() {
        return 2*radius*PI;
    }
    @Override
    public double getArea() {
        return radius*radius*PI;
    }
    @Override
    public double sumAllPerimeter(double allPerimeter) {
        return allPerimeter+this.getPerimeter();
    }
    @Override
    public double sumAllArea(double allArea) {
        return allArea+this.getArea();
    }
    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Shape [] shapes=new Shape[n];
        String allName[]=new String[n];
        double allPerimeter=0,allArea=0;
        for(int i=0;i<n;i++) {
            String name=in.next();
            if(Objects.equals(name, "rect")) {
                Rectangle r=new Rectangle(in.nextInt(),in.nextInt());
                shapes[i]=r;
                allPerimeter=r.sumAllPerimeter(allPerimeter);
                allArea=r.sumAllArea(allArea);
                allName[i]=r.toString();
            }
            else if(Objects.equals(name, "cir")) {
                Circle c=new Circle(in.nextInt());
                shapes[i]=c;
                allPerimeter=c.sumAllPerimeter(allPerimeter);
                allArea=c.sumAllArea(allArea);
                allName[i]=c.toString();
            }
            else {
                System.out.println("error");
            }
        }
        System.out.println(allPerimeter);
        System.out.println(allArea);
        System.out.println(Arrays.toString(allName));
        for(int i=0;i<n;i++) {
            System.out.print(shapes[i].getClass()+",");
            System.out.println(shapes[i].getClass().getSuperclass());
        }

        in.close();
    }
}

