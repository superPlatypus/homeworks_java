package practice_3.Math_and_random;

import java.util.ArrayList;
import java.util.Scanner;

public class _4 {

    private static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        fill();
        print();
        create_second();
    }

    private static void fill(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        if (n < 1){
            fill();
        }
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
    }
    
    private static void print(){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
    private static void create_second(){
        if (list.size() >= 0){
            ArrayList<Integer> sc_list = new ArrayList<>(list.size() / 2);
            for (int i = 0; i < list.size(); i+=2) {
                sc_list.add(list.get(i));
                System.out.print(list.get(i));
            }

        }
    }

}
