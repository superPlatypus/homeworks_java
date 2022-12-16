package practice_8;

public class _5 {
    public static int digSum(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + digSum(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(digSum(123)); // вызов рекурсивной функции
    }
}
