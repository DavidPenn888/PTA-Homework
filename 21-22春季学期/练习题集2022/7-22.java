import java.util.Scanner;

import java.util.Scanner;
class Circle
{
    private int radius;
    public Circle()
    {
        radius=2;
        System.out.println("this is a constructor");
    }
    public Circle(int r)
    {
        if(r<=0)
        {
            radius=2;
        }
        else
            radius=r;
        System.out.println("this is a constructor with para");
    }

    //----------------------

    public void setter(int r)
    {
        if(r<=0)
        {
            radius=2;
        }
        else
            radius=r;
    }
    public int getter()
    {
        return radius;
    }

    //----------------------

    public String toString()
    {
        return "Circle [radius=" + radius + "]";
    }

    public int gerArea()
    {

        double area=Math.PI*radius*radius;
        return (int)area;
    }
}


public class Main
{
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        Circle c1=new Circle();
        System.out.println(c1.toString());
        System.out.println("c1:area="+c1.gerArea());
        Circle c2=new Circle();
        System.out.println(c2.toString());
        c2.setter(in.nextInt());
        System.out.println(c2.toString());
        System.out.println("c2:area="+c2.gerArea());
        Circle c3=new Circle(in.nextInt());
        System.out.println(c3.toString());
        System.out.println("c3:area="+c3.gerArea());
    }
}


