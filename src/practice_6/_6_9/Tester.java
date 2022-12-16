package practice_6._6_9;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book());
        printables.add(new Magazine());

        for (Printable printable: printables){
            printable.print();
        }

    }
}
