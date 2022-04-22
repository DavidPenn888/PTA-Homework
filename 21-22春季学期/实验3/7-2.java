
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Oval Oval1=new Oval(in.nextInt(), in.nextInt());
        System.out.println("The area of "+ Oval1.toString() + " is " + Oval1.area());
        System.out.println("The perimeterof "+ Oval1.toString() + " is " + Oval1.perimeter());
    }
}

abstract class Shape {
    public static double PI=3.1415926;
    public abstract double area();
    public abstract double perimeter();
}

class Oval extends Shape{
    private double a,b;
    Oval() {
        this.a=0;this.b=0;
    }
    Oval(double a,double b) {
        this.a=a;this.b=b;
    }
    public double area() {
        return PI*a*b;
    }
    public double perimeter() {
        return 2*PI*Math.sqrt((a*a+b*b)/2);
    }
    public String toString() {
        return "Oval(" + "a:" + a + ",b:" + b + ')';
    }
}

