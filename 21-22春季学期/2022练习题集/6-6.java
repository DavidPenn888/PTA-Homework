class Circle extends shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return r*r*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*r*Math.PI;
    }
}


