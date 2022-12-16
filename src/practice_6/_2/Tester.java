package practice_6._2;

public class Tester {
    public static void main(String[] args) {
        MovableRectangle rec = new MovableRectangle(0,10, 10, 0, 1, 1);
        rec.MoveDown();
        System.out.println(rec);
    }
}
