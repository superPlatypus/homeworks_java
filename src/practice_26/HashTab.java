package practice_26;

import java.util.HashMap;

public class HashTab<T, V> {
    public static void main(String[] args) {

        HashMap<String, Integer> cats = new HashMap<>();

        HashTabAdd(cats, "Kuzya", 5);
        HashTabAdd(cats, "Barsik", 15);
        HashTabAdd(cats, "Pushok", 2);

        String name = "Barsik";
        HashTabLookUp(cats, name);

        cats.remove("Barsik");
        System.out.println(cats);

    }

    private static void HashTabLookUp(HashMap<String, Integer> cats, String name) {
        Integer BasriksAge = cats.get(name);
        System.out.println(BasriksAge);
    }

    private static void HashTabAdd(HashMap<String, Integer> cats, String Kuzya, int value) {
        cats.put(Kuzya, value);
    }
}
