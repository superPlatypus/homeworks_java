package practice_4_1._1;

public class Rectangle extends Shape{
    private double a;
    private double b;


    public Rectangle(double a, double b) {
        super();
        type = "Rectangle";
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr(){
        return 2 * a + 2 * b;
    }

    @Override
    public double getSquare(){
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", type='" + type + '\'' +
                '}';
    }
}
