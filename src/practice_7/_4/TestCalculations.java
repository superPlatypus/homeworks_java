package practice_7._4;
import java.util.Scanner;

public class TestCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число(int) и степень(int): ");
        int num = sc.nextInt();
        int grad = sc.nextInt();
        MathFunc math = new MathFunc();
        System.out.println(math.pow(num, grad));
        System.out.println("Введите число(int) для получения модуля: ");
        num = sc.nextInt();
        System.out.println(math.abs(num));
        System.out.println("Введите радиус(int) окружности для вычисления площади и длины: ");
        num = sc.nextInt();
        System.out.println(math.PI() * math.pow(num, 2));
        System.out.println(2 * math.PI() * num);
    }
}
