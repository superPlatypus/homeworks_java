package practice_4_1._1;

public class Circle extends Shape{
    private double radius;


    public Circle(double radius) {
        super();
        this.radius = radius;
        type = "Circle";
    }

    @Override
    public double getPerimetr(){
        return 3.14 * radius * 2;
    }

    @Override
    public double getSquare(){
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", type='" + type + '\'' +
                '}';
    }
}
