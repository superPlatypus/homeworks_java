package practice_11._1._2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateComparator {
    public static Date dateCompare(Date d1, Date d2) {
        if (d1.getTime() > d2.getTime()) return d1;
        return d2;

    }

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите первую дату в формате dd.MM.yyyy");
        String STRdate1 = sc.next();
//        System.out.println("Введите вторую дату в формате dd.MM.yyyy-HH.mm.ss");
//        String STRdate2 = sc.next();
        Date d1 = sdf.parse(STRdate1);
        Date d2 = new Date();
        System.out.println(
                d1.getTime() > d2.getTime() ?
                        sdf.format(d1) + " больше, чем " + sdf.format(d2) :
                        sdf.format(d2) + " больше, чем " + sdf.format(d1)
        );
    }
}
