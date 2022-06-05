class RTriangle implements IShape {
    private double a,b;
    public RTriangle (double a,double b) {
        this.a=a;this.b=b;
    }

    @Override
    public double getArea() {
        return a*b*0.5;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(a*a+b*b)+a+b;
    }
}