package practice_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _3 {
    public static void main(String[] args) {
        String regex = "(\\d+\\.\\d{2} (USD|EUR|RUB))";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);

        while(m1.find()) {
            System.out.println("Список цен: " + m1.group());
        }

    }
}
