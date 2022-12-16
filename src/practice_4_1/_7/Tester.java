package practice_4_1._7;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Studying> arr = new ArrayList<>();
        arr.add(new Pupil());
        arr.add(new Student());
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
    }
}
