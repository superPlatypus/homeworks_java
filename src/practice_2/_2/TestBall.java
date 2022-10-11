package practice_2._2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X:");
        ball.setX(sc.nextDouble());
        System.out.println("Enter Y:");
        ball.setY(sc.nextDouble());
        System.out.println(ball);
        System.out.println("Enter xDisp and yDisp:");
        ball.move(sc.nextDouble(), sc.nextDouble());
        System.out.println(ball);

    }





}

