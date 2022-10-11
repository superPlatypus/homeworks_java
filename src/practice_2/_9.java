package practice_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _9 {
    public static void main(String[] args) {
        String[] suits = { "♠", "♣", "♦", "♥"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9" , "10" , "J", "Q", "K", "A"};
        String[] deck = new String[suits.length * ranks.length];
        int c = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[c] = ranks[j] + suits[i];
                c++;
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < ranks.length * suits.length; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        Scanner sc = new Scanner(System.in);
        System.out.println("How many players?");
        int n = sc.nextInt();
        int k = 0;
        if (n <= 10){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(deck[list.get(k++)]);
                }
                System.out.println("----------");
            }
        }
        else{
            System.out.println("Count of players must be less then 11");
        }


    }
}
