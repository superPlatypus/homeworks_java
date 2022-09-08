package practice_2._3;

public class Circle {
    public Point point = new Point();

    public Circle() {
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Center: (" + point.getX() + ";" + point.getY() + ")" + "\nRadius: " + radius;
    }

    //    public double getX() {
//        return point.getX();
//    }
//
//    public void setX(double x) {
//        point.setX(x);
//    }
//
//    public double getY() {
//        return point.getY();
//    }
//
//    public void setY(double y) {
//        point.setY(y);
//    }

}
