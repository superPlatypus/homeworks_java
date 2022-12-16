package practice_4_1._9;

public abstract class Furniture {
    private double price;

    public Furniture(double price){
        this.price = price;
    }

    double getPrice(){
        return price;
    }

    abstract void description();


}
