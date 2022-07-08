
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cylinder c1 = new Cylinder(in.nextInt(), in.nextInt());
        System.out.println(c1.getVolumn());
        Cylinder c2 = new Cylinder();
        System.out.println(c2.getVolumn());
    }
}

class Cylinder {
    private int radius, height;
    Cylinder() {
        new Cylinder(2,1);
        this.radius = 2;
        this.height = 1;
        System.out.println("Constructor no para");
    }
    Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
        System.out.println("Constructor with para");
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public int getVolumn() {
        return (int) (Math.PI*radius*radius*height);
    }
}