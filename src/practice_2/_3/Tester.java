package practice_2._3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        Circle[] circle = new Circle[10];

        for (int i = 0; i < 10; i++) {
            circle[i].setRadius(5);
            circle[i].setX(10);
            circle[i].setY(15);
        }

        System.out.println("X: " + circle[0].getX());
        System.out.println("Y: " + circle[0].getY());
        System.out.println("Radius: " + circle[0].getRadius());




    }


}
