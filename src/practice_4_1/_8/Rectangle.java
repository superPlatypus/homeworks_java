package practice_4_1._8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimetr() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "It is a rectangle with length = " + length + " and width = " + width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
