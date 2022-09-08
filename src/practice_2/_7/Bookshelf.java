package practice_2._7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bookshelf {
    static private Book[] bookshelf;

    public static void main(String[] args) {
        fill();
        System.out.println("Earliest book:");
        System.out.println(earliest());
        System.out.println("Latest book:");
        System.out.println(latest());
        System.out.println("Sorted by year:");
        sort();
        for (int i = 0; i < bookshelf.length; i++) {
            System.out.println(bookshelf[i]);
        }



    }

    private static void fill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of books:");
        int count  = Integer.parseInt(sc.nextLine());
        bookshelf = new Book[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter author:");
            String author = sc.nextLine();
            System.out.println("Enter year:");
            int year = Integer.parseInt(sc.nextLine());
            bookshelf[i] = new Book(author, name, year);
        }
    }

    private static Book latest(){
        Book latest = bookshelf[0];
        for (int i = 0; i < bookshelf.length; i++) {
            if (latest.getYear() < bookshelf[i].getYear()){
                latest = bookshelf[i];
            }
        }
        return latest;
    }

    private static Book earliest(){
        Book earliest = bookshelf[0];
        for (int i = 0; i < bookshelf.length; i++) {
            if (earliest.getYear() > bookshelf[i].getYear()){
                earliest = bookshelf[i];
            }
        }
        return earliest;
    }

    private static void sort(){
        for (int j = bookshelf.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (bookshelf[i].getYear() > bookshelf[i+1].getYear()){
                    Book tmp = bookshelf[i];
                    bookshelf[i] = bookshelf[i+1];
                    bookshelf[i+1] = tmp;
                }
            }
        }
    }


}
