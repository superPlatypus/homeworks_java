package practice_3.Formatting._1_2;

import practice_3.Formatting._1_2.Converter;
import practice_3.Formatting._1_2.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private static ArrayList<Product> products  = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new Product("milk", 100));
        products.add(new Product("bread", 50));
        products.add(new Product("cheese", 200));
        for (int i = 0; i < products.size(); i++) {
            System.out.println("№" + i + ": " + products.get(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose number of product:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Choose currency (eur, usd, gbp):");
        String currency = sc.nextLine();
        Converter converter = new Converter(products.get(n));
        switch (currency){
            case ("eur"):
                System.out.println(converter.to_eur());
                break;
            case ("usd"):
                System.out.println(converter.to_usd());
                break;
            case ("gbp"):
                System.out.println(converter.to_gbp());
                break;
            default:
                System.out.println("Incorrect currency...");
                break;
        }


    }

}
