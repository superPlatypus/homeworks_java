package practice_18;

import java.util.Scanner;

public class ExceptionTest8 {
    void getKey() {
//        Scanner myScanner = new Scanner(System.in);
        try {
//            String key = myScanner.next();
            String key = null;
            printDetails( key );
        }
        catch (Exception e) {
//            String key = myScanner.next();
//            getKey();
            System.out.println("catched");
        }
        finally {
            System.out.println("exception");
        }

    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key == null) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ExceptionTest8 ex = new ExceptionTest8();
        ex.getKey();
    }
}
