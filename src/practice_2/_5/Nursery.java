package practice_2._5;

import java.util.Scanner;

public class Nursery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many dogs in nursery?");
        int count = sc.nextInt();
        Dog[] nursery = new Dog[count];
        for (int i = 0; i < count; i++) {
            nursery[i] = new Dog(sc.nextInt(), sc.nextLine());
        }
        for (int j = 0; j < count; j++) {
            System.out.println(nursery[j]);
            System.out.println("---------");
        }
    }
}
