package practice_6._2;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    @Override
    public void MoveUp() {
        topLeft.MoveUp();
        bottomRight.MoveUp();
    }

    @Override
    public void MoveDown() {
        topLeft.MoveDown();
        bottomRight.MoveDown();
    }

    @Override
    public void MoveLeft() {
        topLeft.MoveLeft();
        bottomRight.MoveLeft();
    }

    @Override
    public void MoveRight() {
        topLeft.MoveRight();
        bottomRight.MoveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
