package practice_2;

import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        for (int i = 0; i < words.length/2; i++) {
            String tmp = words[words.length - 1 - i];
            words[words.length - 1 - i] = words[i];
            words[i] = tmp;
        }
        for (int j = 0; j < words.length; j++) {
            System.out.print(words[j] + " ");
        }
    }
}
