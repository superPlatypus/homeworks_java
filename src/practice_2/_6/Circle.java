package practice_2._6;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double S(){
        return 3.14 * radius * radius;
    }

    public double P(){
        return 3.14 * radius * 2;
    }

    public void compare(Circle circle){
        if (this.radius > circle.getRadius()){
            System.out.println("Bigger!");
        }
        else {
            System.out.println("Smaller!");
        }
    }
}
