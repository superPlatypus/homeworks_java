package practice_3.Math_and_random._2;

public class Circle implements Comparable<Circle> {
    @Override
    public int compareTo(Circle o) {
        return (int) (this.radius - o.getRadius());
    }

    Point center = new Point();
    double radius;

    public void set_xCenter(double x){
        center.setX(x);
    }

    public void set_yCenter(double y){
        center.setY(y);
    }

    public double get_xCenter(){
        return center.getX();
    }

    public double get_yCenter(){
        return center.getY();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
