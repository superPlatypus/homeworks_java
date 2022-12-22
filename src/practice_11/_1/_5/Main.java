package practice_11._1._5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=0; i<10000000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println(linkedList.get(100));

        long start = System.currentTimeMillis();
        arrayList.add(-1);
        long spendTime = System.currentTimeMillis() - start;

        System.out.println("Add time for ArrayList: " + spendTime + " ms");
        start = System.currentTimeMillis();
        linkedList.add(-1);
        spendTime = System.currentTimeMillis() - start;
        System.out.println("Add time for LinkedList: " + spendTime + " ms");

        start = System.currentTimeMillis();
        arrayList.remove(100);
        spendTime = System.currentTimeMillis() - start;
        System.out.println("Remove time for ArrayList: " + spendTime + " ms");

        start = System.currentTimeMillis();
        linkedList.remove(100);
        spendTime = System.currentTimeMillis() - start;
        System.out.println("Remove time for linkedList: " + spendTime + " ms");

        start = System.currentTimeMillis();
        arrayList.indexOf(1000000);
        spendTime = System.currentTimeMillis() - start;
        System.out.println("Find time for ArrayList: " + spendTime + " ms");

        start = System.currentTimeMillis();
        linkedList.indexOf(1000000);
        spendTime = System.currentTimeMillis() - start;
        System.out.println("Find time for LinkedList: " + spendTime + " ms");
    }
}


//    long start = System.currentTimeMillis();
//    merge_sort(iDNumber.get(i), iDNumber.get(j), comp);
//        long spendTime2 = System.currentTimeMillis() - start;
//        System.out.println("Merge time: " + spendTime2 + " ms");