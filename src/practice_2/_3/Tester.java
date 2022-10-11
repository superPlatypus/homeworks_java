package practice_2._3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of circles:");
        int size = sc.nextInt();
        Circle[] circle = new Circle[size];
        for (int i = 0; i < size; i++) {
            int r = i + 1;
            circle[i] = new Circle();
            circle[i].point = new Point(r,r);
            circle[i].setRadius(r*r);
            System.out.println(circle[i]);
            System.out.println("-----------");
        }









    }


}
