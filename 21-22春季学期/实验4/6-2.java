
import java.util.*;
public class Main {

    public static void main(String[] args) {
        double s=0;
        Scanner sc=new Scanner(System.in);
        double r1,r2;
        r1=sc.nextDouble();
        r2=sc.nextDouble();
        Circle c1=new Circle(r1);
        Circle c2=new Circle(r2);
        try{
            s = c1.area();
            System.out.println(s);
            s = c2.area();
            System.out.println(s);
        }
        catch (CircleException e){
            e.print();
        }
    }
}


/* 请在这里填写答案 编写Circle 和CircleException类*/
class Circle {
    private double r;
    public Circle (double r) {
        this.r = r;
    }
    public double area() throws CircleException {
        if(r<0) {
            throw new CircleException(r);
        }
        return r*r*3.14;
    }
}


class CircleException extends Throwable {
    private double r;
    public CircleException(double r) {
        super();
        this.r = r;
    }
    public void print() {
        System.out.println("圆半径为"+ r +"不合理");
    }
}