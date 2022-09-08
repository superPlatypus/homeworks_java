package practice_2._3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Circle[] circle = new Circle[size];
        for (int i = 0; i < size; i++) {
            circle[i] = new Circle();
            circle[i].point = new Point(i,i);
            circle[i].setRadius(i*i);
            System.out.println(circle[i]);
            System.out.println("-----------");
        }



//        Circle circle = new Circle();
//        circle.point = new Point(10,10);
//        circle.setRadius(15);
//        System.out.println(circle);





    }


}
