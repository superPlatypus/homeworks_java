package practice_4_1._1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Shape shape = new Shape();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two sides of rectangle:");
        Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter side of square:");
        Square square = new Square(sc.nextDouble());
        System.out.println("Enter radius of circle:");
        Circle circle = new Circle(sc.nextDouble());

        shape = rectangle;
        System.out.println(shape);
        System.out.println(shape.getPerimetr());
        System.out.println(shape.getSquare());

        shape = square;
        System.out.println(shape);
        System.out.println(shape.getPerimetr());
        System.out.println(shape.getSquare());
        System.out.println(shape);

        shape = circle;
        System.out.println(shape.getPerimetr());
        System.out.println(shape.getSquare());

    }
}
