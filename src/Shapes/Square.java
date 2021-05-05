package Shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea() {
        System.out.println("Override");
        return side * side;
    }

    public int getPerimeter() {
        System.out.println();
        return 4 * side;
    }
}
