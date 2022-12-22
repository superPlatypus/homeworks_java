package practice_18;

import java.util.Scanner;

public class ExceptionTest7 {
    void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();

        printDetails( key );
        System.out.println("printDetails() exception");
    }
    public void printDetails(String key)  {
        try{
            String message = getDetails(key);
            System.out.println( message );
        }
        catch (Exception e){
            System.out.println("catched!");
        }


    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ExceptionTest7 ex = new ExceptionTest7();
        ex.getKey();
    }
}
