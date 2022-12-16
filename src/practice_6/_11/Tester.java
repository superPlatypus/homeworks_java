package practice_6._11;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Введите температуру по Цельсию: ");
        Converter converter = new Converter(new Scanner(System.in).nextInt());
        converter.convert();
    }
}
