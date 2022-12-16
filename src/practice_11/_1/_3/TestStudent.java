package practice_11._1._3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите дату рождения студента в формате dd.MM.yyyy");
        String STRDate = sc.next();
        Date d = sdf.parse(STRDate);
        Student st = new Student("Joe", "Smirnov", d, "Software Engineering", "IKBO-30-21", 2, 1423);
        System.out.println("Введите желаемый формат отбражения даты рождения: ");

        //EEEE;dd.MMMM.yyyy;G;HH:mm:ss:S;z
        //yyyy-MM-dd;HH:mm:ss.SSS;Z

        String formatToDisplay = sc.next();
        System.out.println(st.getFormattedBirthdayDate(formatToDisplay));
    }
}
