
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Square s=new Square(in.nextDouble());
        Rectangle r=new Rectangle(in.nextDouble(),in.nextDouble());
        Circle c=new Circle(in.nextDouble());
        System.out.printf("%.2f %.2f\n",s.getPerimeter(),s.getArea());
        System.out.printf("%.2f %.2f\n",r.getPerimeter(),r.getArea());
        System.out.printf("%.2f %.2f\n",c.getPerimeter(),c.getArea());
    }
}

//在main函数中，分别构造三个Shape类的变量，分别指向一个Square、Rectangle、Circle对象，并输出他们的周长、面积.

class Shape {
    private double per,area;
    public Shape() {}
    public double getPerimeter() {
        per=0.0;
        return per;
    }
    public double getArea() {
        area=0.0;
        return area;
    }
}

class Square extends Shape {
    private double a,per,area;
    public Square(double a) {
        this.a=a;
    }
    public double getPerimeter() {
        per=4*a;
        return per;
    }
    public double getArea() {
        area=a*a;
        return area;
    }
}

/*
定义一个形状类Shape，提供计算周长getPerimeter()和面积getArea()的函数
定义一个子类正方形类Square继承自Shape类，拥有边长属性，提供构造函数，能够计算周长getPerimeter()和面积getArea()
定义一个子类长方形类Rectangle继承自Square类，拥有长、宽属性，提供构造函数，能够计算周长getPerimeter()和面积getArea()
定义一个子类圆形类Circle继承自Shape，拥有半径属性，提供构造函数，能够计算周长getPerimeter()和面积getArea()
在main函数中，分别构造三个Shape类的变量，分别指向一个Square、Rectangle、Circle对象，并输出他们的周长、面积.
 */

class Rectangle extends Square{
    private double a,b,per,area;
    public Rectangle(double a,double b) {
        super(a);
        this.a=a;this.b=b;
    }
    public double getPerimeter() {
        per=2*(a+b);
        return per;
    }
    public double getArea() {
        area=a*b;
        return area;
    }
}

class Circle extends Shape {
    private double r,per,area;
    public Circle(double r) {
        this.r=r;
    }
    public double getPerimeter() {
        per=2*Math.PI*r;
        return per;
    }
    public double getArea() {
        area=Math.PI*r*r;
        return area;
    }
}