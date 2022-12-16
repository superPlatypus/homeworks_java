package practice_6._4;

public class Computer implements Priceable{
    final private double price = 1050.5;


    @Override
    public double getPrice() {
        return price;
    }
}
