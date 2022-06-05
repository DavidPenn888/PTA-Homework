class Circle {
    private double radius;
    Circle(double r) {
        this.radius = r;
    }
    double getArea() {
        return Math.PI*radius*radius;
    }
    double getLength() {
        return Math.PI*2*radius;
    }
}

class Column {
    private double height;
    private Circle bottom;

    public void setBottom(Circle c) {
        this.bottom = c;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBottom() {
        return bottom;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return bottom.getArea()*height;
    }
}