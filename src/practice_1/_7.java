package practice_1;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(fact(a));
    }

    private static int fact(int n){
        if (n == 1)
            return 1;
        return n * fact(n-1);
    }
}
