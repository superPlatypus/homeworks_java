package practice_2._4;

import java.util.Collections;
import java.util.Scanner;

public class Shop{
    private static Computer[] computers;

    public static void main(String[] args) {
        fill();
        System.out.println(find_by_cpu("i9 9900K"));

    }

    private static void fill() {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        computers = new Computer[count];
        for (int i = 0; i < count; i++) {
            computers[i] = new Computer();
            System.out.println("Enter cpu:");
            computers[i].setCpu(sc.nextLine());
            System.out.println("Enter dram (GB):");
            computers[i].setDram(Integer.parseInt(sc.nextLine()));
            System.out.println("Enter price:");
            computers[i].setPrice(Integer.parseInt(sc.nextLine()));
        }
    }

    private static Computer find_by_cpu(String cpu) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getCpu().equals(cpu)) {
                return computers[i];
            }
        }
        return null;
    }

    private static Computer find_by_dram(int dram) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getDram() == dram) {
                return computers[i];
            }
        }
        return null;
    }

    private static Computer find_by_price(int price) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getDram() == price) {
                return computers[i];
            }
        }
        return null;
    }
}
