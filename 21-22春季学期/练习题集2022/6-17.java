class Rectangle {
    private double lenth,wide;
    Rectangle(double lenth, double wide) {
        this.lenth = lenth;
        this.wide = wide;
    }
    double getPerimeter() {
        return 2*(lenth+wide);
    }
    double getArea() {
        return lenth*wide;
    }
}

class Cuboid extends Rectangle{
    private double lenth, wide, height;
    Cuboid(double lenth, double wide, double height) {
        super(lenth,wide);
        this.lenth = lenth;
        this.wide = wide;
        this.height = height;
    }
    double getPerimeter() {
        return 4*(lenth+wide+height);
    }
    double getArea() {
        return 2*(lenth*wide+height*wide+lenth*height);
    }
    double getVolume() {
        return lenth*wide*height;
    }
}