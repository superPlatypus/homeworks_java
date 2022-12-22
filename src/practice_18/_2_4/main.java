package practice_18._2_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Enter an integer ");
//        String intString = myScanner.next();
//        int i = Integer.parseInt(intString);
//        System.out.println(2/i);

//        qwqw - (NumberFormatException.java:67)
//        1.2 - (NumberFormatException.java:67)
//        0 - ArithmeticException: / by zero

        try{
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Hello!");
        }

    }
}
