package practice_13._5;
import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberSTR = sc.next();
        PhoneNumber num = new PhoneNumber(numberSTR);
        System.out.println(num);
    }
}
