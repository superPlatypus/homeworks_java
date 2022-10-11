package practice_4_1._2;

import java.util.ArrayList;

public class Tester {
    private static ArrayList <Phone> phones = new ArrayList<>(3);
    public static void main(String[] args) {
        fill();
        for (Phone phone: phones){
            phone.receiveCall("Vasya");
            System.out.println(phone.getNumber());
            phone.receiveCall("Vasya", "89090001122");
        }
        phones.get(0).sendMessage("89061224545", "89097896655", "89661897777");

    }

    private static void fill() {
        phones.add(new Phone("iphone 14","88005553535", 200 ));
        phones.add(new Phone("nothing phone 1","89999999999", 150 ));
        phones.add(new Phone("pixel 6 pro","84991234567", 179 ));
    }
}
