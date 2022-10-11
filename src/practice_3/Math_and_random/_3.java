package practice_3.Math_and_random;

import java.util.Random;

public class _3 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10,99);
            System.out.print(array[i] + " ");
            if (i > 0){
                if (array[i] < array[i - 1]){
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}
