package practice_4_1._8;

public abstract class  Shape {
    protected String type;
    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    abstract public double getPerimetr();
    abstract public double getArea();
    public void getType(){
        System.out.println(type);
    }
}
