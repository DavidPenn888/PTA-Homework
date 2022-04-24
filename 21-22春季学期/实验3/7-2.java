
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        switch(n) {
            case 1:{
                double a=in.nextDouble();
                if(a>0) {
                    Circle c1=new Circle(a);
                    System.out.printf("Circle's area:%.2f",c1.getArea());
                    break;
                }
                else{
                    System.out.println("Wrong Format");
                    break;
                }
            }
            case 2:{
                double a=in.nextDouble(),b=in.nextDouble();
                if(a>0 && b>0) {
                    Rectangle r1=new Rectangle(a,b);
                    System.out.printf("Rectangle's area:%.2f",r1.getArea());
                    break;
                }
                else {
                    System.out.println("Wrong Format");
                    break;
                }
            }
            case 3:{
                double a=in.nextDouble();
                if(a>0) {
                    Ball b1=new Ball(a);
                    System.out.printf("Ball's surface area:%.2f\n",b1.getArea());
                    System.out.printf("Ball's volume:%.2f",b1.getVolume());
                    break;
                }
                else{
                    System.out.println("Wrong Format");
                    break;
                }
            }
            case 4:{
                double a=in.nextDouble(),b=in.nextDouble(),c=in.nextDouble();
                if(a>0 && b>0 && c>0) {
                    Box b1=new Box(a,b,c);
                    System.out.printf("Box's surface area:%.2f\n",b1.getArea());
                    System.out.printf("Box's volume:%.2f",b1.getVolume());
                    break;
                }
                else{
                    System.out.println("Wrong Format");
                    break;
                }
            }
            default:{
                System.out.println("Wrong Format");
                break;
            }
        }
    }


}

class Shape {
    public Shape() {
        System.out.println("Constructing Shape");
    }
    public double getArea(){
        double area=0.0;
        return area;
    }
}

class Circle extends Shape {
    private double radius,area;
    public Circle(double radius){
        this.radius=radius;
        System.out.println("Constructing Circle");
    }
    public double getArea() {
        area=Math.PI*radius*radius;
        return area;
    }

}

class Rectangle extends Shape{
    private double width,length,area;
    public Rectangle(double width,double length){
        this.width=width;this.length=length;
        System.out.println("Constructing Rectangle");
    }
    public double getArea() {
        area=width*length;
        return area;
    }
}

class Ball extends Circle{
    private double radius,area,vol;
    public Ball(double radius){
        super(radius);
        this.radius=radius;
        System.out.println("Constructing Ball");
    }
    public double getArea() {
        area=4*Math.PI*radius*radius;
        return area;
    }
    public double getVolume() {
        vol=radius*radius*radius*Math.PI*4/3;
        return vol;
    }
}

class Box extends Rectangle{
    private double width,length,height,area,vol;
    public Box(double width,double length,double height){
        super(width,length);
        this.width=width;this.length=length;this.height=height;
        System.out.println("Constructing Box");
    }
    public double getArea() {
        area=2*(width*length+width*height+length*height);
        return area;
    }
    public double getVolume() {
        vol=width*length*height;
        return vol;
    }
}