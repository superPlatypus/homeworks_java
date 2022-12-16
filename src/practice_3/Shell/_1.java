package practice_3.Shell;

public class _1 {
    public static void main(String[] args) {
        System.out.println("1:");
        _1();
        System.out.println("2:");
        _2();
        System.out.println("3:");
        _3();
        System.out.println("4:");
        _4();
        System.out.println("5:");
        _5();


    }

    private static void _5() {
        double d = 3.14;
        String s = Double.toString(d);
        System.out.println(s);
    }

    private static void _4() {
        Double D = 5.9;
        System.out.println(D);
    }

    private static void _3() {
        Double D = 3.14;
        System.out.println("To int: " + D.intValue());
        System.out.println("To byte: " + D.byteValue());
        System.out.println("To float: " + D.floatValue());
        System.out.println("To short: " + D.shortValue());
        System.out.println("To long: " + D.longValue());
    }

    private static void _2() {
        System.out.println(Double.parseDouble("5.3"));
    }

    private static void _1() {
        double d = 5.1;
        Double D = Double.valueOf(d);
        System.out.println(D);
    }
}
