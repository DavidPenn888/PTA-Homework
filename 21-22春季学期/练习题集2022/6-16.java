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