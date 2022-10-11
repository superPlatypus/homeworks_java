package practice_3.Formatting._1_2;

public class Converter {
    private Product product;


    public Converter(Product product) {
        this.product = product;
    }

    public double to_eur(){
        return product.getPrice()/60.5;
    }

    public double to_usd(){
        return product.getPrice()/60.2;
    }

    public double to_gbp(){
        return product.getPrice()/69.09;
    }

}
