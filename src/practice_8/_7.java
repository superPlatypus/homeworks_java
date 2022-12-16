package practice_8;

public class _7 {
    public static void recursion(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        }
        else {
            recursion(n, ++k);
        }
    }
    public static void main(String[] args) {
        final int CONST = 2;
        recursion(36, CONST); // вызов рекурсивной функции
    }
}
