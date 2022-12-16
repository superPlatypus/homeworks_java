package practice_4_1._10;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        double kms = 150;
        ArrayList<Transport> transports = new ArrayList<>();
        transports.add(new Car());
        transports.add(new Train());
        transports.add(new Ship());
        transports.add(new Airplane());

        for (Transport transport: transports) {
            transport.duration(kms);
            transport.price();
        }
        
    }
}
