package practice_8;

import static java.lang.Math.sqrt;

public class _6 {
    public static boolean recursion(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < sqrt(n) + 1 ) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        final int CONST = 2;
        System.out.println(recursion(31,CONST));//ов рекурсивной функции
    }
}
