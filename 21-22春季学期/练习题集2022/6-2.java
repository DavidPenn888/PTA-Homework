
class Rectangle
{
    public double w;
    public double h;
    public Rectangle()
    {
        w=1;
        h=1;
    }
    public Rectangle(double x,double y)
    {
        w=x;
        h=y;
    }
    public double getArea()
    {
        double area;
        area=w*h;
        return area;
    }
    public double getPerimeter()
    {
        double Per;
        Per=2*(w+h);
        return Per;
    }
}


