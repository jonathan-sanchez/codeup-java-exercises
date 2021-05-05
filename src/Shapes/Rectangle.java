package Shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * length + 2 * width;
    }





}
