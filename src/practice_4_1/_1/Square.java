package practice_4_1._1;


public class Square extends Shape{
    private double a;


    public Square(double a) {
        super();
        this.a = a;
        type = "Square";
    }

    @Override
    public double getPerimetr(){
        return 4 * a;
    }

    @Override
    public double getSquare(){
        return a * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", type='" + type + '\'' +
                '}';
    }
}
