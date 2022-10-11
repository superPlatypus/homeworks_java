package practice_3.Math_and_random._2;

import practice_3.Math_and_random._2.Circle;
import practice_3.Math_and_random._2.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Tester {

    private static ArrayList<Circle> circles = new ArrayList<>();

    public static void main(String[] args) {
        fill();
        System.out.println("The biggest circle:\n" + Collections.max(circles));
        System.out.println("The smallest circle:\n" + Collections.min(circles));
        System.out.println("Sorted circles:");
        Collections.sort(circles);
        print();
    }

    private static void print(){
        for (int i = 0; i < circles.size(); i++) {
            System.out.println(circles.get(i));
        }
    }

    private static void fill() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            circles.add(new Circle(new Point(new Random().nextInt(1, 10), new Random().nextInt(1, 10)), (new Random().nextInt(1, 10))));
        }
        print();
    }
}
