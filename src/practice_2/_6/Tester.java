package practice_2._6;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        circle.setRadius(sc.nextDouble());
        System.out.println("S: " + circle.S());
        System.out.println("P: " + circle.P());
        circle.compare(new Circle(15));
    }
}
