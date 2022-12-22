package practice_18._6;

public class ExceptionTest6 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            return "data for " + key;
        }
        catch(NullPointerException e) {
            return "";
        }
    }

    public static void main(String[] args) {
        ExceptionTest6 ex = new ExceptionTest6();
        ex.printMessage(null);
    }
}