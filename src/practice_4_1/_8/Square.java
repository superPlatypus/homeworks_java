package practice_4_1._8;

public class Square extends Rectangle{

    public Square(){
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side , side);
    }

    public Square(double side){
        super(side, side);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        length = width;
    }

    @Override
    public void setLength(double length) {
        width = length;
        this.length = length;
    }
}
