package practice_18._1;

public class main {
    public static void main(String[] args) {
//        System.out.println( 2 / 0 );
//        System.out.println( 2.0 / 0 );

        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }

    }
}
