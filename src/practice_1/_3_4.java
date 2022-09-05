package practice_1;

import java.util.Scanner;

public class _3_4 {
    public static void main(String[] args) {
        execute();

    }

    private static void execute() {
        int size;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int j = 0;
        int min = arr[0];
        int max = arr[0];
        while (j < size){
            if (arr[j] > max){
                max = arr[j];
            }
            if (arr[j] < min){
                min = arr[j];
            }
            j++;
        }
        System.out.println("Summ: " + sum + "\nSr: " + sum/size + "\nMin = " + min + "\nMax = " + max);
    }

 }