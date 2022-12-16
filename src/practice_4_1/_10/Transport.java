package practice_4_1._10;

public abstract class Transport {
    private double speed;
    private double price;

    public Transport(double speed, double price) {
        this.speed = speed;
        this.price = price;
    }

    public void duration(double kms){
        System.out.println("Время поездки : " + kms / speed + " часов");
    }

    public void price(){
        System.out.println("Стоимость поездки : " + price + " рублей");
    }
}
