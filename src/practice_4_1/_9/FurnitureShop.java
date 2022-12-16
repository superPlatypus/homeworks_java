package practice_4_1._9;

import java.util.ArrayList;

public class FurnitureShop {
    public static void main(String[] args) {
        ArrayList<Furniture> items = new ArrayList<>();
        items.add(new Chair());
        items.add(new Table());

        System.out.println(items.get(0).getPrice());
        items.get(0).description();

        System.out.println(items.get(1).getPrice());
        items.get(1).description();

    }
}
