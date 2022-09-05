package practice_2._2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);

        Scanner sc = new Scanner(System.in);
        ball.setX(sc.nextDouble());
        ball.setY(sc.nextDouble());
        System.out.println(ball);

        ball.move(sc.nextDouble(), sc.nextDouble());
        System.out.println(ball);

    }





}

