package practice_3.Math_and_random;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class _1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(10);
        System.out.println("filling with Random");
        fill_Random(arr1);
        sort(arr1);
        System.out.println("filling with rand()");
        fill_rand(arr1);
        sort(arr1);
    }

    private static void sort(ArrayList<Integer> arr1) {
        print(arr1);
        arr1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        print(arr1);
    }

    private static void fill_Random(ArrayList<Integer> arr1) {
        for (int i=0; i<10; i++) {
            arr1.add(new Random().nextInt() % 100);
        }
    }

    private static void fill_rand(ArrayList<Integer> arr1) {
        for (int i=0; i<10; i++) {
            arr1.add( (int) (Math.random() * 1000));
        }
    }

    private static void print(ArrayList<Integer> arr1) {
        for (Integer item: arr1) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
